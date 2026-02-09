package ar.edu.unrn.parcial.persistencia;

import ar.edu.unrn.parcial.modelo.Agenda;
import ar.edu.unrn.parcial.modelo.Contacto;
import ar.edu.unrn.parcial.modelo.Evento;
import ar.edu.unrn.parcial.modelo.MultiAgenda;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PersistenciaTest {

    @Test
    void testGuardarYCargar(@TempDir Path tempDir) throws IOException {
        Path archivo = tempDir.resolve("datos.txt");
        MultiAgenda ma = new MultiAgenda();
        Agenda agenda = new Agenda("Laboral");
        
        Contacto c1 = new Contacto("Pedro", "99999999", LocalDate.of(1990, 1, 1), "p@p.com", "123");
        agenda.agregarContacto(c1);
        
        Evento e1 = new Evento("Reunion", LocalDateTime.of(2023, 10, 10, 10, 0));
        e1.agregarInvitado(c1);
        agenda.agregarEvento(e1);
        
        ma.agregarAgenda(agenda);

        IPersistencia persistencia = new PersistenciaArchivo();
        persistencia.guardar(ma, archivo.toString());

        MultiAgenda cargada = persistencia.cargar(archivo.toString());
        
        Agenda agendaCargada = cargada.obtenerAgenda("Laboral");
        assertNotNull(agendaCargada);
        assertEquals(1, agendaCargada.cantidadContactos());
        
        Optional<Contacto> contactoOpt = agendaCargada.buscarContactoPorDni("99999999");
        assertTrue(contactoOpt.isPresent());
        assertTrue(contactoOpt.get().teLlamas("Pedro"));
        
        assertTrue(agendaCargada.tieneEventos());
        Optional<Evento> eventoOpt = agendaCargada.buscarEventoConTitulo("Reunion");
        assertTrue(eventoOpt.isPresent());
        
        Evento eventoCargado = eventoOpt.get();
        assertTrue(eventoCargado.estaInvitado(contactoOpt.get()), "El contacto debería estar invitado al evento");
    }
}

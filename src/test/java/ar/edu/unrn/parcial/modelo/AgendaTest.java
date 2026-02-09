package ar.edu.unrn.parcial.modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class AgendaTest {

    private Agenda agenda;
    private Contacto c1;
    private Contacto c2;
    private Contacto c3;

    @BeforeEach
    void setUp() {
        agenda = new Agenda("Personal");
        c1 = new Contacto("Juan Perez", "11111111", LocalDate.of(1990, 1, 1), "juan@mail.com", "555-1111");
        c2 = new Contacto("Ana Gomez", "22222222", LocalDate.of(1995, 5, 5), "ana@mail.com", "555-2222");
        c3 = new Contacto("Juan Perez", "33333333", LocalDate.of(1985, 12, 12), "juan.otro@mail.com", "555-3333");
    }

    @Test
    void agregarContactoExitoso() {
        agenda.agregarContacto(c1);
        assertEquals(1, agenda.cantidadContactos());
        assertTrue(agenda.existeContacto(c1));
    }

    @Test
    void agregarContactoDuplicadoNoDebeAgregar() {
        agenda.agregarContacto(c1);
        agenda.agregarContacto(c1);
        
        Contacto copiaC1 = new Contacto("Juan Perez", "11111111", LocalDate.now(), "x", "x");
        agenda.agregarContacto(copiaC1);

        assertEquals(1, agenda.cantidadContactos());
    }

    @Test
    void buscarContactoPorDni() {
        agenda.agregarContacto(c1);
        Optional<Contacto> encontrado = agenda.buscarContactoPorDni("11111111");
        assertTrue(encontrado.isPresent());
        assertEquals(c1, encontrado.get());
    }

    @Test
    void buscarContactoPorNombre() {
        agenda.agregarContacto(c1);
        agenda.agregarContacto(c2);
        agenda.agregarContacto(c3);

        List<Contacto> resultados = agenda.buscarContactoPorNombre("Juan Perez");
        assertEquals(2, resultados.size());
    }

    @Test
    void listarContactosOrdenadosPorNombre() {
        agenda.agregarContacto(c1);
        agenda.agregarContacto(c2);
        

        List<Contacto> ordenados = agenda.listarContactosOrdenados(Comparator.naturalOrder());
        
        assertEquals(c2, ordenados.get(0));
        assertEquals(c1, ordenados.get(1));
    }
    
    @Test
    void listarContactosOrdenadosPorFechaNacimiento() {
        agenda.agregarContacto(c1);
        agenda.agregarContacto(c2);
        agenda.agregarContacto(c3);

        List<Contacto> ordenados = agenda.listarContactosOrdenados(Contacto.comparadorPorFecha());
        
        assertEquals(c3, ordenados.get(0));
        assertEquals(c1, ordenados.get(1));
        assertEquals(c2, ordenados.get(2));
    }
}

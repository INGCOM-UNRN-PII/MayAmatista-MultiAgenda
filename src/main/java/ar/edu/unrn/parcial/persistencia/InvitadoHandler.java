package ar.edu.unrn.parcial.persistencia;

import ar.edu.unrn.parcial.modelo.Agenda;
import ar.edu.unrn.parcial.modelo.Contacto;
import ar.edu.unrn.parcial.modelo.Evento;

import java.util.Optional;

/**
 * Estrategia para procesar líneas que definen un Invitado a un evento.
 */
public class InvitadoHandler implements ILineaHandler {

    /**
     * Busca el contacto por DNI y lo agrega como invitado al evento actual.
     *
     * @param partes arreglo con los datos de la línea (DNI).
     * @param contexto contexto de la carga.
     */
    @Override
    public void procesar(String[] partes, ContextoCarga contexto) {
        Agenda agenda = contexto.obtenerAgendaActual();
        Evento evento = contexto.obtenerEventoActual();

        if (agenda != null && evento != null) {
            String dniInvitado = partes[1];
            Optional<Contacto> invitado = agenda.buscarContactoPorDni(dniInvitado);
            invitado.ifPresent(evento::agregarInvitado);
        }
    }
}

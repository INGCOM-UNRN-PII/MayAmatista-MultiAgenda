package ar.edu.unrn.parcial.persistencia;

import ar.edu.unrn.parcial.modelo.Agenda;
import ar.edu.unrn.parcial.modelo.Evento;

import java.time.LocalDateTime;

/**
 * Estrategia para procesar líneas que definen un Evento.
 */
public class EventoHandler implements ILineaHandler {

    /**
     * Crea un nuevo Evento, lo agrega a la agenda y lo establece como evento actual.
     *
     * @param partes arreglo con los datos de la línea.
     * @param contexto contexto de la carga.
     */
    @Override
    public void procesar(String[] partes, ContextoCarga contexto) {
        Agenda agenda = contexto.obtenerAgendaActual();
        if (agenda != null) {
            String titulo = partes[1];
            LocalDateTime fecha = LocalDateTime.parse(partes[2]);

            Evento evento = new Evento(titulo, fecha);
            agenda.agregarEvento(evento);
            contexto.establecerEventoActual(evento);
        }
    }
}

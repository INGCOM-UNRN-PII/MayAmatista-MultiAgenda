package ar.edu.unrn.parcial.persistencia;

import ar.edu.unrn.parcial.modelo.Agenda;
import ar.edu.unrn.parcial.modelo.Evento;
import ar.edu.unrn.parcial.modelo.MultiAgenda;

/**
 * Clase que mantiene el estado durante el proceso de carga de datos.
 */
public class ContextoCarga {
    private MultiAgenda multiAgenda;
    private Agenda agendaActual;
    private Evento eventoActual;

    /**
     * Constructor que inicializa el contexto con una nueva MultiAgenda.
     */
    public ContextoCarga() {
        this.multiAgenda = new MultiAgenda();
    }

    /**
     * Obtiene la MultiAgenda que se está construyendo.
     *
     * @return la instancia de MultiAgenda.
     */
    public MultiAgenda obtenerMultiAgenda() {
        return multiAgenda;
    }

    /**
     * Obtiene la agenda que se está procesando actualmente.
     *
     * @return la agenda actual.
     */
    public Agenda obtenerAgendaActual() {
        return agendaActual;
    }

    /**
     * Establece la agenda actual en el contexto.
     *
     * @param agendaActual la nueva agenda activa.
     */
    public void establecerAgendaActual(Agenda agendaActual) {
        this.agendaActual = agendaActual;
    }

    /**
     * Obtiene el evento que se está procesando actualmente.
     *
     * @return el evento actual.
     */
    public Evento obtenerEventoActual() {
        return eventoActual;
    }

    /**
     * Establece el evento actual en el contexto.
     *
     * @param eventoActual el nuevo evento activo.
     */
    public void establecerEventoActual(Evento eventoActual) {
        this.eventoActual = eventoActual;
    }
}

package ar.edu.unrn.parcial.persistencia;

import ar.edu.unrn.parcial.modelo.Agenda;

/**
 * Estrategia para procesar líneas que definen una Agenda.
 */
public class AgendaHandler implements ILineaHandler {

    /**
     * Crea una nueva Agenda y la establece en el contexto.
     * Reinicia el evento actual a null.
     *
     * @param partes arreglo con los datos de la línea.
     * @param contexto contexto de la carga.
     */
    @Override
    public void procesar(String[] partes, ContextoCarga contexto) {
        String nombreAgenda = partes[1];
        Agenda agenda = new Agenda(nombreAgenda);
        contexto.obtenerMultiAgenda().agregarAgenda(agenda);
        contexto.establecerAgendaActual(agenda);
        contexto.establecerEventoActual(null);
    }
}

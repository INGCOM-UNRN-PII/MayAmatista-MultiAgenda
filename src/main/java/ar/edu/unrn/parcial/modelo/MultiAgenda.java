package ar.edu.unrn.parcial.modelo;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase que representa un conjunto de Agendas.
 */
public class MultiAgenda {
    private Map<String, Agenda> agendas;

    /**
     * Constructor de la clase. Inicializa el mapa de agendas.
     */
    public MultiAgenda() {
        this.agendas = new HashMap<>();
    }

    /**
     * Agrega una nueva agenda a la multiagenda.
     *
     * @param agenda la agenda a agregar.
     */
    public void agregarAgenda(Agenda agenda) {
        agendas.put(agenda.nombreAgenda(), agenda);
    }

    /**
     * Obtiene una agenda por su nombre.
     *
     * @param nombre el nombre de la agenda a buscar.
     * @return la agenda encontrada o null si no existe.
     */
    public Agenda obtenerAgenda(String nombre) {
        return agendas.get(nombre);
    }
    
    /**
     * Elimina una agenda por su nombre.
     *
     * @param nombre el nombre de la agenda a eliminar.
     * @return la agenda eliminada o null si no existía.
     */
    public Agenda eliminarAgenda(String nombre) {
        return agendas.remove(nombre);
    }

    /**
     * Guarda los datos de todas las agendas en el formatter.
     *
     * @param formatter el formatter donde escribir los datos.
     */
    public void guardarDatos(java.util.Formatter formatter) {
        for (Agenda agenda : agendas.values()) {
            agenda.guardarDatos(formatter);
        }
    }
    
    /**
     * Verifica si existe una agenda con el nombre dado.
     *
     * @param nombre el nombre a verificar.
     * @return true si la agenda existe, false en caso contrario.
     */
    public boolean contieneAgenda(String nombre) {
        return agendas.containsKey(nombre);
    }
}

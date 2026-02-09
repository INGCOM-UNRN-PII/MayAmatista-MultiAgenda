package ar.edu.unrn.parcial.modelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Clase que representa una agenda de contactos y eventos.
 */
public class Agenda {
    private String nombre;
    private List<Contacto> contactos;
    private List<Evento> eventos;

    /**
     * Constructor de la clase Agenda.
     *
     * @param nombre es el nombre de la agenda.
     */
    public Agenda(String nombre) {
        this.nombre = nombre;
        this.contactos = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }

    /**
     * Agrega un contacto a la agenda si no existe previamente.
     *
     * @param contacto es el contacto a agregar.
     */
    public void agregarContacto(Contacto contacto) {
        if (existeContacto(contacto)) {
            return; 
        }
        contactos.add(contacto);
    }

    /**
     * Elimina un contacto de la agenda dado su DNI.
     *
     * @param dni es el DNI del contacto a eliminar.
     * @return true si se eliminó algún contacto, false en caso contrario.
     */
    public boolean eliminarContacto(String dni) {
        return contactos.removeIf(c -> c.esTuDni(dni));
    }

    /**
     * Verifica si un contacto ya existe en la agenda.
     *
     * @param contacto es el contacto a verificar.
     * @return true si el contacto existe, false en caso contrario.
     */
    public boolean existeContacto(Contacto contacto) {
        return contactos.contains(contacto);
    }

    /**
     * Busca un contacto por su DNI.
     *
     * @param dni es el DNI a buscar.
     * @return un Optional que contiene el contacto si se encuentra, o vacío si no.
     */
    public Optional<Contacto> buscarContactoPorDni(String dni) {
        return contactos.stream()
                .filter(c -> c.esTuDni(dni))
                .findFirst();
    }

    /**
     * Busca contactos por nombre.
     *
     * @param nombre es el nombre a buscar (parcial o completo).
     * @return una lista de contactos que coinciden con el nombre.
     */
    public List<Contacto> buscarContactoPorNombre(String nombre) {
        return contactos.stream()
                .filter(c -> c.teLlamas(nombre))
                .collect(Collectors.toList());
    }
    
    /**
     * Retorna una lista de contactos ordenada según un comparador.
     *
     * @param comparador es el criterio de ordenamiento.
     * @return una lista ordenada de contactos.
     */
    public List<Contacto> listarContactosOrdenados(Comparator<Contacto> comparador) {
        List<Contacto> copia = new ArrayList<>(contactos);
        copia.sort(comparador);
        return copia;
    }

    /**
     * Retorna la cantidad de contactos en la agenda.
     *
     * @return el número de contactos.
     */
    public int cantidadContactos() {
        return contactos.size();
    }
    
    /**
     * Limpia la agenda, eliminando todos los contactos y eventos.
     */
    public void limpiar() {
        contactos.clear();
        eventos.clear();
    }

    /**
     * Agrega un evento a la agenda.
     *
     * @param evento es el evento a agregar.
     */
    public void agregarEvento(Evento evento) {
        this.eventos.add(evento);
    }

    /**
     * Guarda los datos de todos los contactos y eventos en el formatter.
     *
     * @param formatter es el objeto donde se escribirán los datos.
     */
    public void guardarDatos(java.util.Formatter formatter) {
        formatter.format("AGENDA;%s%n", nombre);
        for (Contacto c : contactos) {
            c.guardarDatos(formatter);
        }
        for (Evento e : eventos) {
            e.guardarDatos(formatter);
        }
    }
    
    /**
     * Obtiene el nombre de la agenda.
     *
     * @return el nombre de la agenda.
     */
    public String nombreAgenda() {
        return nombre;
    }
    
    /**
     * Verifica si la agenda tiene eventos programados.
     *
     * @return true si hay eventos, false si la lista está vacía.
     */
    public boolean tieneEventos() {
        return !eventos.isEmpty();
    }
    
    /**
     * Busca un evento por su título.
     *
     * @param titulo es el título a buscar.
     * @return un Optional con el evento si se encuentra.
     */
    public Optional<Evento> buscarEventoConTitulo(String titulo) {
        return eventos.stream().filter(e -> e.tieneTitulo(titulo)).findFirst();
    }
}

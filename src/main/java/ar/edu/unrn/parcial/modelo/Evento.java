package ar.edu.unrn.parcial.modelo;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Clase que representa un evento en la agenda.
 */
public class Evento {
    private String titulo;
    private LocalDateTime fecha;
    private Set<Contacto> invitados;

    /**
     * Constructor de la clase Evento.
     *
     * @param titulo es el título del evento.
     * @param fecha es la fecha y hora del evento.
     */
    public Evento(String titulo, LocalDateTime fecha) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.invitados = new HashSet<>();
    }

    /**
     * Agrega un invitado al evento.
     *
     * @param contacto es el contacto a invitar.
     */
    public void agregarInvitado(Contacto contacto) {
        this.invitados.add(contacto);
    }

    /**
     * Elimina un invitado del evento.
     *
     * @param contacto es el contacto a eliminar de la lista de invitados.
     */
    public void eliminarInvitado(Contacto contacto) {
        this.invitados.remove(contacto);
    }

    /**
     * Retorna la cantidad de invitados al evento.
     *
     * @return el número de invitados.
     */
    public int cantidadInvitados() {
        return invitados.size();
    }
    
    /**
     * Verifica si un contacto está invitado al evento.
     *
     * @param contacto es el contacto a verificar.
     * @return true si está invitado, false en caso contrario.
     */
    public boolean estaInvitado(Contacto contacto) {
        return invitados.contains(contacto);
    }

    /**
     * Verifica si el evento ocurre en la fecha especificada.
     *
     * @param fechaBuscada es la fecha a verificar.
     * @return true si la fecha coincide, false en caso contrario.
     */
    public boolean ocurreEnFecha(LocalDateTime fechaBuscada) {
        return this.fecha.equals(fechaBuscada);
    }
    
    /**
     * Verifica si el evento tiene el título especificado.
     *
     * @param tituloBuscado es el título a buscar.
     * @return true si coincide (ignorando mayúsculas), false en caso contrario.
     */
    public boolean tieneTitulo(String tituloBuscado) {
        return this.titulo.equalsIgnoreCase(tituloBuscado);
    }

    /**
     * Guarda los datos del evento y sus invitados en el formatter.
     *
     * @param formatter es el objeto donde se escribirán los datos.
     */
    public void guardarDatos(java.util.Formatter formatter) {
        formatter.format("E;%s;%s%n", titulo, fecha);
        for (Contacto invitado : invitados) {
            invitado.escribirSoloDni(formatter);
        }
    }

}

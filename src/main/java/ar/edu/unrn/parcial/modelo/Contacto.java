package ar.edu.unrn.parcial.modelo;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Clase que representa un contacto en la agenda.
 */
public class Contacto implements Comparable<Contacto> {
    private String nombre;
    private String dni;
    private LocalDate fechaNacimiento;
    private String email;
    private String telefono;

    /**
     * Constructor de la clase Contacto.
     *
     * @param nombre es el nombre del contacto.
     * @param dni es el documento del contacto.
     * @param fechaNacimiento es la fecha de nacimiento del contacto.
     * @param email es el correo electrónico del contacto.
     * @param telefono es el número de teléfono del contacto.
     */
    public Contacto(String nombre, String dni, LocalDate fechaNacimiento, String email, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.telefono = telefono;
    }

    /**
     * Verifica si el DNI proporcionado coincide con el del contacto.
     *
     * @param dniBuscado es el DNI a verificar.
     * @return true si el DNI coincide, false en caso contrario.
     */
    public boolean esTuDni(String dniBuscado) {
        return this.dni.equals(dniBuscado);
    }
    
    /**
     * Verifica si el nombre proporcionado coincide con el del contacto (ignorando mayúsculas/minúsculas).
     *
     * @param nombreBuscado es el nombre a verificar.
     * @return true si el nombre coincide, false en caso contrario.
     */
    public boolean teLlamas(String nombreBuscado) {
        return this.nombre.equalsIgnoreCase(nombreBuscado);
    }

    /**
     * Guarda los datos del contacto en el formatter con formato específico.
     *
     * @param formatter es el objeto donde se escribirán los datos.
     */
    public void guardarDatos(java.util.Formatter formatter) {
        formatter.format("C;%s;%s;%s;%s;%s%n", nombre, dni, fechaNacimiento, email, telefono);
    }
    
    /**
     * Escribe solo el DNI del contacto en el formatter, usado para invitaciones.
     *
     * @param formatter es el objeto donde se escribirá el DNI.
     */
    public void escribirSoloDni(java.util.Formatter formatter) {
        formatter.format("INV;%s%n", dni);
    }
    
    /**
     * Obtiene la fecha de nacimiento del contacto.
     *
     * @return la fecha de nacimiento.
     */
    public LocalDate fechaNacimiento() {
        return fechaNacimiento;
    }
    
    /**
     * Crea un comparador para ordenar contactos por fecha de nacimiento.
     *
     * @return un Comparator de Contactos.
     */
    public static java.util.Comparator<Contacto> comparadorPorFecha() {
        return java.util.Comparator.comparing(c -> c.fechaNacimiento);
    }

    /**
     * Compara este contacto con otro objeto para ver si son iguales.
     *
     * @param o el objeto a comparar.
     * @return true si son iguales (mismo DNI), false en caso contrario.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(dni, contacto.dni);
    }

    /**
     * Calcula el hash code del contacto basado en su DNI.
     *
     * @return el hash code del contacto.
     */
    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    /**
     * Compara este contacto con otro por nombre alfabéticamente.
     *
     * @param o el contacto con el que comparar.
     * @return un entero negativo, cero o positivo según si este nombre es menor, igual o mayor al del otro contacto.
     */
    @Override
    public int compareTo(Contacto o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }

    /**
     * Devuelve una representación en String del contacto.
     *
     * @return una cadena con el nombre y DNI del contacto.
     */
    @Override
    public String toString() {
        return nombre + " (DNI: " + dni + ")";
    }
}

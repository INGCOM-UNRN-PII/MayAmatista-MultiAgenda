package ar.edu.unrn.parcial.persistencia;

import ar.edu.unrn.parcial.modelo.Agenda;
import ar.edu.unrn.parcial.modelo.Contacto;

import java.time.LocalDate;

/**
 * Estrategia para procesar líneas que definen un Contacto.
 */
public class ContactoHandler implements ILineaHandler {

    /**
     * Crea un nuevo Contacto y lo agrega a la agenda actual del contexto.
     *
     * @param partes arreglo con los datos de la línea.
     * @param contexto contexto de la carga.
     */
    @Override
    public void procesar(String[] partes, ContextoCarga contexto) {
        Agenda agenda = contexto.obtenerAgendaActual();
        if (agenda != null) {
            String nombre = partes[1];
            String dni = partes[2];
            LocalDate fechaNacimiento = LocalDate.parse(partes[3]);
            String email = partes[4];
            String telefono = partes[5];

            Contacto contacto = new Contacto(nombre, dni, fechaNacimiento, email, telefono);
            agenda.agregarContacto(contacto);
        }
    }
}

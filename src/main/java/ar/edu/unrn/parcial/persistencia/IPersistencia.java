package ar.edu.unrn.parcial.persistencia;

import ar.edu.unrn.parcial.modelo.MultiAgenda;
import java.io.IOException;

/**
 * Interfaz que define el contrato para la persistencia de datos.
 */
public interface IPersistencia {
    
    /**
     * Guarda la MultiAgenda en la ruta especificada.
     *
     * @param multiAgenda la estructura de datos a guardar.
     * @param ruta la ruta del archivo o destino donde guardar.
     * @throws IOException si ocurre un error de entrada/salida.
     */
    void guardar(MultiAgenda multiAgenda, String ruta) throws IOException;

    /**
     * Carga una MultiAgenda desde la ruta especificada.
     *
     * @param ruta la ruta del archivo o origen desde donde cargar.
     * @return la MultiAgenda cargada con sus datos.
     * @throws IOException si ocurre un error de entrada/salida.
     */
    MultiAgenda cargar(String ruta) throws IOException;
}

package ar.edu.unrn.parcial.persistencia;

/**
 * Interfaz para las estrategias de procesamiento de líneas del archivo.
 */
public interface ILineaHandler {
    
    /**
     * Procesa una línea del archivo desglosada en partes y actualiza el contexto.
     *
     * @param partes arreglo de strings con los datos de la línea.
     * @param contexto el estado actual de la carga.
     */
    void procesar(String[] partes, ContextoCarga contexto);
}

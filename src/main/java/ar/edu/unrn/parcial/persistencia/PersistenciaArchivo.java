package ar.edu.unrn.parcial.persistencia;

import ar.edu.unrn.parcial.modelo.MultiAgenda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Implementación de IPersistencia que guarda y carga datos desde un archivo de texto.
 */
public class PersistenciaArchivo implements IPersistencia {

    private java.util.Map<String, ILineaHandler> handlers;

    /**
     * Constructor que inicializa el mapa de handlers.
     */
    public PersistenciaArchivo() {
        this.handlers = new java.util.HashMap<>();
        this.handlers.put("AGENDA", new AgendaHandler());
        this.handlers.put("C", new ContactoHandler());
        this.handlers.put("E", new EventoHandler());
        this.handlers.put("INV", new InvitadoHandler());
    }

    /**
     * Guarda la información de la multiagenda en un archivo.
     *
     * @param multiAgenda la estructura de datos a guardar.
     * @param ruta la ruta del archivo de destino.
     * @throws IOException si hay errores al escribir el archivo.
     */
    @Override
    public void guardar(MultiAgenda multiAgenda, String ruta) throws IOException {
        Path path = Paths.get(ruta);
        try (Formatter formatter = new Formatter(Files.newBufferedWriter(path))) {
            multiAgenda.guardarDatos(formatter);
        }
    }

    /**
     * Carga la información de la multiagenda desde un archivo.
     * Utiliza el patrón Strategy para procesar cada tipo de línea.
     *
     * @param ruta la ruta del archivo de origen.
     * @return la MultiAgenda poblada con los datos del archivo.
     * @throws IOException si hay errores al leer el archivo.
     */
    @Override
    public MultiAgenda cargar(String ruta) throws IOException {
        Path path = Paths.get(ruta);
        if (!Files.exists(path)) {
            return new MultiAgenda();
        }

        ContextoCarga contexto = new ContextoCarga();

        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                if (linea.trim().isEmpty()) continue;

                String[] partes = linea.split(";");
                String tipo = partes[0];

                ILineaHandler handler = handlers.get(tipo);
                if (handler != null) {
                    handler.procesar(partes, contexto);
                }
            }
        }
        return contexto.obtenerMultiAgenda();
    }
}

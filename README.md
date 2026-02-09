# MultiAgenda - UNRN

Este proyecto implementa una solución para el parcial de Programación II, consistente en una **MultiAgenda** capaz de gestionar múltiples agendas personales, contactos y eventos.

## Enunciado y Requerimientos

El objetivo principal es crear una aplicación que permita:

*   **Gestionar Múltiples Agendas**: Contenedor principal de agendas.
*   **Gestión de Contactos**:
    *   Agregar y Eliminar contactos.
    *   Buscar contactos por **Nombre** y **DNI**.
    *   Verificar existencia de un contacto.
    *   Listar contactos ordenados por **Nombre** (alfabéticamente) o **Fecha de Nacimiento**.
    *   Consultar la cantidad total de contactos.
*   **Gestión de Eventos**:
    *   Asociar eventos a las agendas.
    *   Agregar contactos como **invitados** a los eventos.
*   **Persistencia**:
    *   Almacenar y recuperar la información completa (agendas, contactos, eventos, invitados) en archivos en disco.
    *   Uso de patrones de diseño para una carga y guardado flexible.

## Arquitectura y Diseño

El proyecto está organizado en paquetes siguiendo una arquitectura en capas simple:

### `ar.edu.unrn.parcial.modelo`
Contiene las clases del dominio:
*   **`MultiAgenda`**: Clase raiz que agrupa las agendas.
*   **`Agenda`**: Maneja la lista de contactos y eventos. Implementa la lógica de búsqueda y ordenamiento.
*   **`Contacto`**: Representa a una persona con sus datos (DNI, nombre, fecha de nacimiento, etc.).
*   **`Evento`**: Representa un evento con fecha y lista de invitados.

### `ar.edu.unrn.parcial.persistencia`
Maneja la entrada/salida de datos.
*   **`PersistenciaArchivo`**: Implementación concreta para guardar/cargar en archivos de texto.
*   **Patrón Strategy / Command**: Se utiliza una interfaz `ILineaHandler` y un mapa de estrategias (`AgendaHandler`, `ContactoHandler`, `EventoHandler`, `InvitadoHandler`, `ContextoCarga`) para procesar las líneas del archivo durante la carga. Esto permite extender el formato del archivo fácilmente sin modificar la lógica principal de lectura.

## Tests y Cobertura

De acuerdo a lo solicitado, no se incluye una clase `Main` ejecutable, sino que la verificación del funcionamiento se realiza a través de **Unit Tests**.

Se incluyen tests para validar:
*   **`AgendaTest`**:
    *   Agregar contactos (y evitar duplicados).
    *   Búsquedas por DNI y Nombre.
    *   Ordenamiento por Nombre y Fecha de Nacimiento.
*   **`PersistenciaTest`**:
    *   Ciclo completo de guardado y carga de datos.
    *   Persistencia de relaciones (Contactos invitados a Eventos).
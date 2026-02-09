
# El Juez Dredd
**branch/revision:** main, 9b7663e,
## Checkstyle código
## Checkstyle Report - Dredd
**Version checkstyle:** 10.9.2
### Archivos procesados
    
#### Archivo: tpi_2026-submissions/tpi_2026-multiagenda/src/main/java/ar/edu/unrn/parcial/modelo/Agenda.java
| tipo | mensaje | línea |
|:----:|:-------:|-------|
|error|Missing a Javadoc comment.|13|
|error|Missing a Javadoc comment.|14|
|error|Missing a Javadoc comment.|15|
|error|`nombre` hides a field.|22|
|error|Line has trailing spaces.|35|
|error|`nombre` hides a field.|78|
|error|Line has trailing spaces.|83|
|error|Line has trailing spaces.|104|
|error|Line has trailing spaces.|136|
|error|Line has trailing spaces.|145|
|error|Line has trailing spaces.|154|

#### Archivo: tpi_2026-submissions/tpi_2026-multiagenda/src/main/java/ar/edu/unrn/parcial/modelo/Contacto.java
| tipo | mensaje | línea |
|:----:|:-------:|-------|
|error|Missing a Javadoc comment.|10|
|error|Missing a Javadoc comment.|11|
|error|Missing a Javadoc comment.|12|
|error|Missing a Javadoc comment.|13|
|error|Missing a Javadoc comment.|14|
|error|Line is longer than 90 characters (found 106).|25|
|error|`nombre` hides a field.|25|
|error|`dni` hides a field.|25|
|error|`fechaNacimiento` hides a field.|25|
|error|`email` hides a field.|25|
|error|`telefono` hides a field.|25|
|error|Line has trailing spaces.|42|
|error|Line is longer than 90 characters (found 106).|44|
|error|Line is longer than 90 characters (found 94).|59|
|error|Line has trailing spaces.|61|
|error|Line has trailing spaces.|70|
|error|Line has trailing spaces.|79|
|error|`if` construct must use `{}`s.|97|
|error|`if` construct must use `{}`s.|98|
|error|Line is longer than 90 characters (found 117).|117|

#### Archivo: tpi_2026-submissions/tpi_2026-multiagenda/src/main/java/ar/edu/unrn/parcial/modelo/Evento.java
| tipo | mensaje | línea |
|:----:|:-------:|-------|
|error|Missing a Javadoc comment.|11|
|error|Missing a Javadoc comment.|12|
|error|Missing a Javadoc comment.|13|
|error|`titulo` hides a field.|21|
|error|`fecha` hides a field.|21|
|error|Line has trailing spaces.|53|
|error|Line has trailing spaces.|73|

#### Archivo: tpi_2026-submissions/tpi_2026-multiagenda/src/main/java/ar/edu/unrn/parcial/modelo/MultiAgenda.java
| tipo | mensaje | línea |
|:----:|:-------:|-------|
|error|Missing a Javadoc comment.|10|
|error|Line has trailing spaces.|37|
|error|Line has trailing spaces.|58|

#### Archivo: tpi_2026-submissions/tpi_2026-multiagenda/src/main/java/ar/edu/unrn/parcial/persistencia/AgendaHandler.java
##### Archivo OK.
    
#### Archivo: tpi_2026-submissions/tpi_2026-multiagenda/src/main/java/ar/edu/unrn/parcial/persistencia/ContactoHandler.java
| tipo | mensaje | línea |
|:----:|:-------:|-------|
|error|`3` is a magic number.|25|
|error|`4` is a magic number.|26|
|error|`5` is a magic number.|27|
|error|Line is longer than 90 characters (found 92).|29|

#### Archivo: tpi_2026-submissions/tpi_2026-multiagenda/src/main/java/ar/edu/unrn/parcial/persistencia/ContextoCarga.java
| tipo | mensaje | línea |
|:----:|:-------:|-------|
|error|Missing a Javadoc comment.|11|
|error|Missing a Javadoc comment.|12|
|error|Missing a Javadoc comment.|13|
|error|`agendaActual` hides a field.|45|
|error|`eventoActual` hides a field.|63|

#### Archivo: tpi_2026-submissions/tpi_2026-multiagenda/src/main/java/ar/edu/unrn/parcial/persistencia/EventoHandler.java
##### Archivo OK.
    
#### Archivo: tpi_2026-submissions/tpi_2026-multiagenda/src/main/java/ar/edu/unrn/parcial/persistencia/ILineaHandler.java
| tipo | mensaje | línea |
|:----:|:-------:|-------|
|error|Line has trailing spaces.|7|

#### Archivo: tpi_2026-submissions/tpi_2026-multiagenda/src/main/java/ar/edu/unrn/parcial/persistencia/IPersistencia.java
| tipo | mensaje | línea |
|:----:|:-------:|-------|
|error|Line has trailing spaces.|10|

#### Archivo: tpi_2026-submissions/tpi_2026-multiagenda/src/main/java/ar/edu/unrn/parcial/persistencia/InvitadoHandler.java
##### Archivo OK.
    
#### Archivo: tpi_2026-submissions/tpi_2026-multiagenda/src/main/java/ar/edu/unrn/parcial/persistencia/PersistenciaArchivo.java
| tipo | mensaje | línea |
|:----:|:-------:|-------|
|error|Missing a Javadoc comment.|17|
|error|`if` construct must use `{}`s.|65|

## PMD código
## PMD
    
### Archivo tpi_2026-submissions/tpi_2026-multiagenda/src/main/java/ar/edu/unrn/parcial/modelo/Agenda.java
#### TooManyMethods de Design en la línea 12
 - Descripción:  This class has too many methods, consider refactoring it. 
 - Encontrado en: package: `ar.edu.unrn.parcial.modelo`, clase: `Agenda` método: `` variable: ``
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_design.html#toomanymethods)
 
  
#### ImmutableField de Design en la línea 13
 - Descripción:  Field 'nombre' may be declared final 
 - Encontrado en: package: `ar.edu.unrn.parcial.modelo`, clase: `Agenda` método: `` variable: `nombre`
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_design.html#immutablefield)
 
  
#### ImmutableField de Design en la línea 14
 - Descripción:  Field 'contactos' may be declared final 
 - Encontrado en: package: `ar.edu.unrn.parcial.modelo`, clase: `Agenda` método: `` variable: `contactos`
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_design.html#immutablefield)
 
  
#### ImmutableField de Design en la línea 15
 - Descripción:  Field 'eventos' may be declared final 
 - Encontrado en: package: `ar.edu.unrn.parcial.modelo`, clase: `Agenda` método: `` variable: `eventos`
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_design.html#immutablefield)
 
  
### Archivo tpi_2026-submissions/tpi_2026-multiagenda/src/main/java/ar/edu/unrn/parcial/modelo/Contacto.java
#### ImmutableField de Design en la línea 10
 - Descripción:  Field 'nombre' may be declared final 
 - Encontrado en: package: `ar.edu.unrn.parcial.modelo`, clase: `Contacto` método: `` variable: `nombre`
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_design.html#immutablefield)
 
  
#### ImmutableField de Design en la línea 11
 - Descripción:  Field 'dni' may be declared final 
 - Encontrado en: package: `ar.edu.unrn.parcial.modelo`, clase: `Contacto` método: `` variable: `dni`
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_design.html#immutablefield)
 
  
#### ImmutableField de Design en la línea 12
 - Descripción:  Field 'fechaNacimiento' may be declared final 
 - Encontrado en: package: `ar.edu.unrn.parcial.modelo`, clase: `Contacto` método: `` variable: `fechaNacimiento`
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_design.html#immutablefield)
 
  
#### AvoidFieldNameMatchingMethodName de Error Prone en la línea 12
 - Descripción:  Field fechaNacimiento has the same name as a method 
 - Encontrado en: package: `ar.edu.unrn.parcial.modelo`, clase: `Contacto` método: `` variable: `fechaNacimiento`
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_errorprone.html#avoidfieldnamematchingmethodname)
 
  
#### ImmutableField de Design en la línea 13
 - Descripción:  Field 'email' may be declared final 
 - Encontrado en: package: `ar.edu.unrn.parcial.modelo`, clase: `Contacto` método: `` variable: `email`
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_design.html#immutablefield)
 
  
#### ImmutableField de Design en la línea 14
 - Descripción:  Field 'telefono' may be declared final 
 - Encontrado en: package: `ar.edu.unrn.parcial.modelo`, clase: `Contacto` método: `` variable: `telefono`
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_design.html#immutablefield)
 
  
#### ShortVariable de Code Style en la línea 96
 - Descripción:  Avoid variables with short names like o 
 - Encontrado en: package: `ar.edu.unrn.parcial.modelo`, clase: `Contacto` método: `equals` variable: `o`
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_codestyle.html#shortvariable)
 
  
#### OnlyOneReturn de Code Style en la línea 97
 - Descripción:  A method should have only one exit point, and that should be the last statement in the method 
 - Encontrado en: package: `ar.edu.unrn.parcial.modelo`, clase: `Contacto` método: `equals` variable: ``
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_codestyle.html#onlyonereturn)
 
  
#### ControlStatementBraces de Code Style en la línea 97
 - Descripción:  This statement should have braces 
 - Encontrado en: package: `ar.edu.unrn.parcial.modelo`, clase: `Contacto` método: `equals` variable: ``
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_codestyle.html#controlstatementbraces)
 
  
#### OnlyOneReturn de Code Style en la línea 98
 - Descripción:  A method should have only one exit point, and that should be the last statement in the method 
 - Encontrado en: package: `ar.edu.unrn.parcial.modelo`, clase: `Contacto` método: `equals` variable: ``
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_codestyle.html#onlyonereturn)
 
  
#### ControlStatementBraces de Code Style en la línea 98
 - Descripción:  This statement should have braces 
 - Encontrado en: package: `ar.edu.unrn.parcial.modelo`, clase: `Contacto` método: `equals` variable: ``
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_codestyle.html#controlstatementbraces)
 
  
#### ShortVariable de Code Style en la línea 120
 - Descripción:  Avoid variables with short names like o 
 - Encontrado en: package: `ar.edu.unrn.parcial.modelo`, clase: `Contacto` método: `compareTo` variable: `o`
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_codestyle.html#shortvariable)
 
  
### Archivo tpi_2026-submissions/tpi_2026-multiagenda/src/main/java/ar/edu/unrn/parcial/modelo/Evento.java
#### ImmutableField de Design en la línea 11
 - Descripción:  Field 'titulo' may be declared final 
 - Encontrado en: package: `ar.edu.unrn.parcial.modelo`, clase: `Evento` método: `` variable: `titulo`
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_design.html#immutablefield)
 
  
#### ImmutableField de Design en la línea 12
 - Descripción:  Field 'fecha' may be declared final 
 - Encontrado en: package: `ar.edu.unrn.parcial.modelo`, clase: `Evento` método: `` variable: `fecha`
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_design.html#immutablefield)
 
  
#### ImmutableField de Design en la línea 13
 - Descripción:  Field 'invitados' may be declared final 
 - Encontrado en: package: `ar.edu.unrn.parcial.modelo`, clase: `Evento` método: `` variable: `invitados`
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_design.html#immutablefield)
 
  
### Archivo tpi_2026-submissions/tpi_2026-multiagenda/src/main/java/ar/edu/unrn/parcial/modelo/MultiAgenda.java
#### ImmutableField de Design en la línea 10
 - Descripción:  Field 'agendas' may be declared final 
 - Encontrado en: package: `ar.edu.unrn.parcial.modelo`, clase: `MultiAgenda` método: `` variable: `agendas`
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_design.html#immutablefield)
 
  
### Archivo tpi_2026-submissions/tpi_2026-multiagenda/src/main/java/ar/edu/unrn/parcial/persistencia/ContextoCarga.java
#### ImmutableField de Design en la línea 11
 - Descripción:  Field 'multiAgenda' may be declared final 
 - Encontrado en: package: `ar.edu.unrn.parcial.persistencia`, clase: `ContextoCarga` método: `` variable: `multiAgenda`
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_design.html#immutablefield)
 
  
### Archivo tpi_2026-submissions/tpi_2026-multiagenda/src/main/java/ar/edu/unrn/parcial/persistencia/PersistenciaArchivo.java
#### ImmutableField de Design en la línea 17
 - Descripción:  Field 'handlers' may be declared final 
 - Encontrado en: package: `ar.edu.unrn.parcial.persistencia`, clase: `PersistenciaArchivo` método: `` variable: `handlers`
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_design.html#immutablefield)
 
  
#### OnlyOneReturn de Code Style en la línea 57
 - Descripción:  A method should have only one exit point, and that should be the last statement in the method 
 - Encontrado en: package: `ar.edu.unrn.parcial.persistencia`, clase: `PersistenciaArchivo` método: `cargar` variable: ``
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_codestyle.html#onlyonereturn)
 
  
#### InefficientEmptyStringCheck de Performance en la línea 65
 - Descripción:  String.trim().length() == 0 / String.trim().isEmpty() is an inefficient way to validate a blank String. 
 - Encontrado en: package: `ar.edu.unrn.parcial.persistencia`, clase: `PersistenciaArchivo` método: `cargar` variable: ``
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_performance.html#inefficientemptystringcheck)
 
  
#### ControlStatementBraces de Code Style en la línea 65
 - Descripción:  This statement should have braces 
 - Encontrado en: package: `ar.edu.unrn.parcial.persistencia`, clase: `PersistenciaArchivo` método: `cargar` variable: ``
 [+Información](https://docs.pmd-code.org/pmd-doc-7.0.0/pmd_rules_java_codestyle.html#controlstatementbraces)
 
  
## Conan ejecuta los Tests
### ar.edu.unrn.parcial.modelo.AgendaTest
Total de tests: 6. De los cuales, fallos en: 0, errores en: 0
- buscarContactoPorNombre() (en 0.136 segundos): Pasó
- listarContactosOrdenadosPorFechaNacimiento() (en 0.019 segundos): Pasó
- agregarContactoExitoso() (en 0.01 segundos): Pasó
- agregarContactoDuplicadoNoDebeAgregar() (en 0.046 segundos): Pasó
- listarContactosOrdenadosPorNombre() (en 0.004 segundos): Pasó
- buscarContactoPorDni() (en 0.002 segundos): Pasó


### ar.edu.unrn.parcial.persistencia.PersistenciaTest
Total de tests: 1. De los cuales, fallos en: 0, errores en: 0
- testGuardarYCargar(Path) (en 0.106 segundos): Pasó



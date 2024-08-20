# Tarea 1

## Conceptos Fundamentales

### ¿Qué es un servicio REST?
Un servicio REST (Representational State Transfer) es un estilo de arquitectura para diseñar servicios web que permite la comunicación entre sistemas mediante HTTP. REST utiliza recursos identificados por URIs y operaciones basadas en los métodos HTTP.

### ¿Cuáles son los principios del diseño RESTful?
Los principios del diseño RESTful incluyen:
- **Identificación de recursos**: Cada recurso es identificado de manera única por un URI.
- **Manipulación de recursos a través de representaciones**: Los recursos son manipulados mediante sus representaciones (por ejemplo, JSON, XML).
- **Mensajes autodescriptivos**: Cada mensaje HTTP incluye suficiente información para describir cómo debe procesarse.
- **Hipermedios como motor del estado de la aplicación (HATEOAS)**: Los clientes interactúan con una aplicación completamente a través de hipermedios proporcionados dinámicamente por el servidor.

### ¿Qué es HTTP y cuáles son los métodos HTTP más comunes?
HTTP (Hypertext Transfer Protocol) es un protocolo de comunicación utilizado en la web para intercambiar datos entre un cliente y un servidor. Los métodos HTTP más comunes son:
- **GET**: Recupera información de un recurso.
- **POST**: Envía datos al servidor para crear un nuevo recurso.
- **PUT**: Actualiza un recurso existente.
- **DELETE**: Elimina un recurso.

### ¿Qué es un recurso en el contexto de un servicio REST?
Un recurso es una entidad o dato al que se accede mediante un URI. En un servicio REST, los recursos representan objetos o conceptos (por ejemplo, un usuario, un producto, etc.).

### ¿Qué es un endpoint?
Un endpoint es una URL específica dentro de un servicio REST que expone una funcionalidad particular. Es donde los recursos están disponibles para ser accedidos mediante métodos HTTP.

## Estructura de un Servicio REST

### ¿Qué es un URI y cómo se define?
Un URI (Uniform Resource Identifier) es una cadena de caracteres que identifica un recurso de manera única en la web. Un URI se define como una combinación de un esquema (por ejemplo, `http`), una dirección del host, y un camino (path) hacia el recurso.

### ¿Qué es una API RESTful?
Una API RESTful es una interfaz de programación de aplicaciones que sigue los principios de REST para permitir la interacción con los recursos a través de URIs y métodos HTTP.

### ¿Qué son los códigos de estado HTTP y cómo se usan en REST?
Los códigos de estado HTTP son respuestas numéricas del servidor que indican el resultado de la solicitud realizada por el cliente. En REST, estos códigos se utilizan para informar si una operación fue exitosa o si hubo algún error.

| Código | Significado                     |
|--------|---------------------------------|
| 200    | OK - La solicitud fue exitosa.  |
| 201    | Created - Recurso creado.       |
| 400    | Bad Request - Solicitud incorrecta. |
| 401    | Unauthorized - No autenticado.  |
| 404    | Not Found - Recurso no encontrado. |
| 500    | Internal Server Error - Error en el servidor. |

### ¿Qué es JSON y por qué se usa comúnmente en APIs REST?
JSON (JavaScript Object Notation) es un formato ligero de intercambio de datos basado en texto, fácil de leer y escribir para humanos, y fácil de interpretar y generar para máquinas. Se usa comúnmente en APIs REST porque es independiente del lenguaje, lo que lo hace ideal para la interoperabilidad entre sistemas.


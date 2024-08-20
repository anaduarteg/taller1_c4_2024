# Tarea 2

## Sección 1: Introducción a Servicios en Quarkus

1. **¿Qué es @ApplicationScoped en Quarkus?**

   `@ApplicationScoped` es una anotación en Quarkus que indica que una única instancia del bean se creará y compartirá durante toda la vida de la aplicación. Es útil cuando necesitas mantener el estado compartido o reutilizar un servicio a lo largo de la aplicación.

2. **¿Cómo funciona la inyección de dependencias en Quarkus?**

En Quarkus, la inyección de dependencias permite que los componentes, como los servicios, sean inyectados automáticamente en otras partes de la aplicación. Esto se hace mediante la anotación `@Inject`, lo que facilita el uso y la gestión de dependencias sin tener que instanciarlas manualmente. 

3. **¿Cuál es la diferencia entre @ApplicationScoped, @RequestScoped, y @Singleton en Quarkus?**

   - `@ApplicationScoped`: Un solo bean compartido en toda la aplicación.
   - `@RequestScoped`: Un nuevo bean se crea para cada petición HTTP.
   - `@Singleton`: Similar a `@ApplicationScoped`, pero con un ciclo de vida gestionado por la JVM, no por Quarkus.

4. **¿Cómo se define un servicio en Quarkus utilizando @ApplicationScoped?**

   Un servicio se define creando una clase anotada con `@ApplicationScoped`. Ejemplo:

   ```java
   import javax.enterprise.context.ApplicationScoped;

   @ApplicationScoped
   public class MiServicio {
       // Lógica del servicio
   } 
   ```

5. **¿Por qué es importante manejar correctamente los alcances (scopes) en Quarkus al crear servicios?**

Un manejo adecuado de los scopes es crucial para evitar problemas como el uso excesivo de memoria, condiciones de carrera, o fallos en la gestión del estado. Definir correctamente el scope asegura que los recursos se utilicen de manera eficiente y que el comportamiento de la aplicación sea predecible.

## Sección 2: Creación de un ApiResponse Genérico

1. **¿Qué es un ApiResponse genérico y cuál es su propósito en un servicio REST?**

   Un `ApiResponse` genérico es un contenedor que encapsula las respuestas de los endpoints REST, permitiendo devolver datos junto con un mensaje de estado y un código HTTP. Esto estandariza las respuestas, haciendo el API más fácil de consumir.

2. **¿Cómo se implementa una clase ApiResponse genérica en Quarkus?**

   ```java
   public class ApiResponse<T> {
       private T data;
       private String message;
       private int statusCode;

       public ApiResponse(T data, String message, int statusCode) {
           this.data = data;
           this.message = message;
           this.statusCode = statusCode;
       }

       // Getters y setters
   }
   ```
3. **¿Cómo se modifica un recurso REST en Quarkus para que utilice un ApiResponse genérico?**

```java   
@GET
@Path("/greet")
public ApiResponse<String> greetUser() {
    return new ApiResponse<>("Hello, User!", "Success", 200);
}
```

4. **¿Qué beneficios ofrece el uso de un ApiResponse genérico en términos de mantenimiento y consistencia de código?**

Al usar un `ApiResponse` genérico, se garantiza que todas las respuestas del API sigan un formato consistente, lo que simplifica el manejo de errores, la implementación de cambios, y mejora la experiencia del desarrollador que consume el API.

5. **¿Cómo manejarías diferentes tipos de respuestas (éxito, error, etc.) utilizando la clase ApiResponse?**

```java
public ApiResponse<T> createSuccessResponse(T data) {
    return new ApiResponse<>(data, "Operation successful", 200);
}

public ApiResponse<T> createErrorResponse(String errorMessage) {
    return new ApiResponse<>(null, errorMessage, 400);
}
```

### Sección 3: Integración y Buenas Prácticas

1. **¿Qué consideraciones se deben tener al inyectar servicios en un recurso REST en Quarkus?**

   Debes asegurarte de que el servicio inyectado tenga el scope correcto, que los recursos compartidos sean manejados adecuadamente, y que el manejo de excepciones esté bien diseñado para evitar que errores inesperados afecten negativamente al servicio.

2. **¿Cómo se pueden manejar excepciones en un servicio REST utilizando ApiResponse?**

   ```java
   @GET
   @Path("/safeGreet")
   public ApiResponse<String> safeGreet() {
       try {
           String result = "Hello, Secure User!";
           return new ApiResponse<>(result, "Success", 200);
       } catch (Exception e) {
           return new ApiResponse<>(null, "An error occurred: " + e.getMessage(), 500);
       }
   }
   ```

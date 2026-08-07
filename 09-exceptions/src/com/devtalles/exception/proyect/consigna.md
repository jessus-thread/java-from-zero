# **Práctica: Mejores Prácticas en el Manejo de Excepciones en Java**

## **Objetivo**

Desarrollar un sistema simple de registro de estudiantes que implemente las mejores prácticas de manejo de excepciones vistas en clase.

## **Descripción**

Deberás crear un programa en Java que permita gestionar un registro de estudiantes, implementando validaciones tempranas, excepciones personalizadas y un manejo adecuado de los posibles errores.

## **Requisitos**

### **Funcionalidades Básicas**

1. Registrar nuevos estudiantes (nombre, edad, ID)
2. Eliminar estudiantes existentes
3. Mostrar todos los estudiantes registrados
4. Salir del programa

### **Validaciones Obligatorias**

- El nombre no puede estar vacío
- La edad debe estar entre 17 y 100 años
- El ID debe seguir el formato: una letra mayúscula seguida de 5 dígitos (ejemplo: A12345)
- No se pueden registrar dos estudiantes con el mismo ID

### **Excepciones a Implementar**

1. Crear al menos dos excepciones personalizadas:
    - `DuplicateStudentException`: para cuando se intenta registrar un estudiante con un ID ya existente
    - `StudentNotFoundException`: para cuando se intenta eliminar un estudiante que no existe
2. Utilizar `IllegalArgumentException` para las validaciones de los parámetros

### **Requisitos de Implementación**

1. Aplicar el principio "Fail Fast": validar los parámetros al inicio de los métodos
2. Usar excepciones específicas, no genéricas
3. Proporcionar mensajes de error claros y útiles
4. Documentar las excepciones que puede lanzar cada método usando Javadoc
5. Implementar un manejo adecuado de las excepciones en la interfaz de usuario
6. Los mensajes que se muestran por consola deben estar en español
7. Todo el código (clases, métodos, variables, comentarios) debe estar en inglés

## **Estructura del Proyecto**

Tu solución debe incluir al menos las siguientes clases:

- `StudentRegistrationSystem`: clase principal que gestiona el registro
- `Student`: clase que representa a un estudiante
- `DuplicateStudentException`: excepción personalizada
- `StudentNotFoundException`: excepción personalizada

## **Criterios de Evaluación**

1. Correcta implementación de las validaciones tempranas
2. Uso apropiado de excepciones personalizadas
3. Manejo específico de cada tipo de excepción
4. Claridad y utilidad de los mensajes de error
5. Documentación adecuada del código
6. Robustez del programa (no debe terminar abruptamente ante errores)

## **Entrega**

Deberás entregar un archivo .zip con:

1. El código fuente completo (.java)
2. Un breve informe (máximo 1 página) explicando tus decisiones de diseño en cuanto al manejo de excepciones

**Fecha límite de entrega**: [Insertar fecha]

## **Ejemplo de Ejecución**

```
Bienvenido al Sistema de Registro de Estudiantes

1. Registrar estudiante
2. Eliminar estudiante
3. Mostrar todos los estudiantes
4. Salir
Seleccione una opción: 1
Nombre: Juan Pérez
Edad: 20
ID (formato: A12345): A12345
Estudiante registrado correctamente.

1. Registrar estudiante
2. Eliminar estudiante
3. Mostrar todos los estudiantes
4. Salir
Seleccione una opción: 1
Nombre: María García
Edad: 15
Error de validación: La edad debe estar entre 17 y 100 años.

1. Registrar estudiante
2. Eliminar estudiante
3. Mostrar todos los estudiantes
4. Salir
Seleccione una opción: 2
ID del estudiante a eliminar: B12345
Error de búsqueda: No se encontró ningún estudiante con ID: B12345.
```
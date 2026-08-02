import java.util.ArrayList;

public class ExamplesArrays {
    public static void main(String[] args) {
        /*
            Arreglo de números enteros (Wrapper). Este arreglo es estático,
            es decir, una vez instanciado en memoria, su longitud es inmutable.

            Rendimiento: Los arreglos estáticos no tienen la sobrecarga de
            los métodos de una clase como ArrayList. Son el acceso más directo
            a la memoria RAM que permite Java.
         */
        Integer[] numbers = { 1, 2, 3, 4, 5 };

        // Modificar un valor por posición en específico: O(1)
        numbers[0] = 1000;

        for (Integer num : numbers) {
            System.out.println(num);
        }

        System.out.println("--------------------------");

        /*
            Reservamos un bloque contiguo en memoria para 100 elementos.

            Nota técnica: Al ser un arreglo de primitivos (int), el valor por
            defecto de cada posición se inicializa automáticamente en 0 a nivel
            de bytes. No hay valores null aquí.

            La palabra reservada 'new' indica que el arreglo en sí mismo es un
            objeto para la Máquina Virtual de Java (JVM), aunque su contenido
            sean datos primitivos puros.
         */
        int[] fixedArray = new int[100];

        for (int number : fixedArray) {
            System.out.println(number);
        }

        // length no es un método (no lleva paréntesis), es un atributo final (constante) del arreglo.
        System.out.println("Dimensión: " + fixedArray.length);

        /*
            Estructuras de datos dinámicas (Java Collections Framework)

            Para usar genéricos (<>) y colecciones dinámicas, Java nos obliga
            a usar Clases Wrapper (Integer) porque el JFC trabaja exclusivamente
            con Referencias a Objetos, no con primitivos.
         */
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(30);

        for (Integer num : numbers2) {
            System.out.println("ArrayList: " + num);
        }

        System.out.println("--------------------------");

        // Primitivos: Memoria pura, valor por defecto = 0
        int[] numbersPrimitive = new int[5];

        // Wrappers: Referencias a objetos, valor por defecto = null
        Integer[] numbersWrapper = new Integer[5];

        /*
            Regla de Arquitectura:
            - Usamos primitivos (int[]) cuando necesitamos máximo rendimiento,
              cálculos matemáticos puros y no nos importa el estado "ausente".
            - Usamos Wrappers (Integer[]) o Colecciones cuando necesitamos
              representar la ausencia de valor (null), interactuar con APIs,
              o utilizar métodos utilitarios (.toString(), .parseInt()).
         */
        numbersPrimitive[0] = 5;
        numbersWrapper[4] = 50;

        // Bucle For-Each (Sintaxis mejorada para iteradores)
        for (Integer num : numbersWrapper) {
            // Protección contra NullPointerException (NPE)
            if (num != null) {
                System.out.println(num.toString());
                continue;
            }
            System.out.println("Es null");
        }

        System.out.println("-------------------------------------------------");

        /*
            REDIMENSIONAMIENTO MANUAL: La magia detrás de ArrayList
            Como los arreglos son inmutables en tamaño, la única forma de
            "crecer" es crear un arreglo nuevo y copiar los datos.
         */
        int[] numberOriginal = new int[5];
        numberOriginal[0] = 20;
        numberOriginal[4] = 29;

        // 1. Creamos un nuevo espacio de memoria con la capacidad ampliada.
        int[] newNumbers = new int[numberOriginal.length + 1];

        /*
            2. System.arraycopy(): O(n)
            Este método es extremadamente rápido porque no itera elemento por elemento
            en Java. Es un método "nativo" (escrito en C/C++) que le dice al Sistema
            Operativo que copie un bloque de memoria RAM directamente a otra dirección.

            Parámetros: (origen, posOrigen, destino, posDestino, cantidadDeElementos)
         */
        System.arraycopy(numberOriginal, 0, newNumbers, 0, numberOriginal.length);

        newNumbers[5] = 500;

        for (int num : newNumbers) {
            System.out.println(num);
        }

        System.out.println("--------------------------------");

        /*
            ELIMINACIÓN MANUAL: Desplazamiento de bits (Shift)
            Esta es la recreación exacta de por qué ArrayList.remove() es O(n).
         */
        int[] numbersRandoms = {1, 2, 3, 4, 5, 9, 0};
        final int deletePosition = 2; // Queremos borrar el '3'

        /*
            Iteramos desde la posición a borrar, y movemos todos los elementos
            de la derecha un espacio hacia la izquierda. Tapamos el hueco.
         */
        for (int i = deletePosition; i < numbersRandoms.length - 1; i++) {
            numbersRandoms[i] = numbersRandoms[i + 1];
        }

        // Limpiamos la última posición sobrante (opcional, pero buena práctica)
        numbersRandoms[numbersRandoms.length - 1] = 0;

        // Modificación extra
        numbersRandoms[0] = 200;

        for (int number : numbersRandoms) {
            System.out.println(number);
        }
    }
}
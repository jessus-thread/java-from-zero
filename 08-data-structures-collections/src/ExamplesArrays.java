import java.util.ArrayList;

public class ExamplesArrays {
    public static void main(String[] args) {
        /*
            Arreglo de numeros enteros, este arreglo es estatico,
            es decir, una vez creada la variable no se podran añadir mas
            datos.

            Es importante saber que los arreglos estaticos al ser de
            longitud fija son mas rapidos que los arreglos dinamicos ya que
            los arrays fijos no estan sobrecargados con metodos
         */

        Integer[] numbers = { 1, 2, 3, 4, 5 };

        // Mpodificar un valor por pocision en especifico
        numbers[0] = 1000;

        for (Integer num : numbers) {
            System.out.println(num);
        }

        System.out.println("--------------------------");

        /*
            De esta manera reservamos un espacio de 1000 elementos
            si escribir todos de manera implicita.

            El valor por defecto de cada pocision es 0

            La palabra reservada new sirve para crear objetos pero tambien
            es para rervar espacios en memoria en el caso de los arreglos.

            Estos numeros enteros son tratados en memoria como objetos pero
            en el sistema son tratados como enteros primitivos
         */

        int[] fixedArray = new int[100];

        for (int number : fixedArray) {
            System.out.println(number);
        }

        System.out.println("Dimensión: " + fixedArray.length );

        /*
            Estructura de datos dinamicas

            Cuando trabajamos con estructuras dinamicas debemos trabajar con objetos
         */
        ArrayList<Integer> numbers2 = new ArrayList<>();

        // añadir datos al array
        numbers2.add(30);

        for (Integer num : numbers2) {
            System.out.println("ArrayList: " + num);
        }

        int[] numbersPrimitive = new int[5];
        // Los valores por defecto son null
        Integer[] numbersWrapper = new Integer[5];

        /*
            En los arreglos con primitivos no podemos almacenar null
            mientras que en los de wrappers si
         */
        numbersPrimitive[0] = 5;
        numbersWrapper[4] = 50;

        // Este tipo de for se llama forEch
        for (Integer num : numbersWrapper) {
            // Al ser Wrappers podemos acceder a sus metodos
            if (num != null) {
                System.out.println(num.toString());

                continue;
            }

            System.out.println("Es null");
        }

        System.out.println("-------------------------------------------------");

        /*
            Un tema a considerar es que si necesitamos rendimiento y no necesitamos
            trabajar con métodos el tipo de arreglo con datos pŕimitivos es el corecto,
            pero, si necesitamos trabajar con null y con metodos el arreglo con wrappers
            es el correcto
        */

        /*
            Como bien sabemos los arreglos estaticos no se pueden aumentar el tamaño
            de manera dinamica, pero tenemos una solucion y es la siguiente
         */
        int[] numberOriginal = new int[5];

        numberOriginal[0] = 20;
        numberOriginal[4] = 29;

        /*
            La solucion es crear un nuevo arreglo y entre los corchetes
            ponemos la longitud del arreglo original mas la cantidad
            que deseamos aumentar
         */
        int[] newNumbers = new int[numberOriginal.length + 1];

        /*
            Este método nos permite copiar un arreglo a otro arreglo

            1. El primer metodo es el arreglo que vamos a copiar
            2. Desde que pocision se empezaran a copiar del arreglo original
            3. Es el arreglo destino donde se copiaran los elementos
            4. Desde que pocision se empezaran a guardar en el nuevo arreglo
            5. la longitud del arreglo que se va a copiar
         */
        System.arraycopy(numberOriginal, 0, newNumbers, 0, numberOriginal.length);

        newNumbers[5] = 500;

        for (int num : newNumbers) {
            System.out.println(num);
        }

        System.out.println("--------------------------------");

        int[] numbersRandoms = {1, 2, 3, 4, 5, 9, 0};
        final int deletePosition = 2;

        /*
            Recorremos los elementos hacia una pocision anterior
            para eliminar el numbero 3
         */
        for (int i = deletePosition; i < numbersRandoms.length - 1; i++) {
            numbersRandoms[i] = numbersRandoms[ i + 1];
        }

        numbersRandoms[numbersRandoms.length - 1] = 0;

        numbersRandoms[0] = 200;

        for (int number : numbersRandoms) {
            System.out.println(number);
        }
    }
}

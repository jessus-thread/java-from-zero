import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        /*
            Arreglo de numeros enteros, este arreglo es estatico,
            es decir, una vez creada la variable no se podran añadir mas
            datos.
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
    }
}

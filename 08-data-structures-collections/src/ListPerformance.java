import java.util.*;

public class ListPerformance {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        /*
            El signo _ sirve para felicitar la lectura, ya que que facilmente
            sabemos que es cien mil
         */
        int elements = 100_000;

        // Insertar al final
        long start = System.nanoTime();

        for (int i = 0; i < elements; i++) {
            arrayList.add(i);
        }

        long end = System.nanoTime();

        System.out.println("ArrayList insertion time: " + (end - start) + " ns");

        start = System.nanoTime();

        for (int i = 0; i < elements; i++) {
            linkedList.add(i);
        }

        end = System.nanoTime();

        System.out.println("LinkedList insertion time: " + (end - start) + " ns");

        // Acceder a elementos
        start = System.nanoTime();
        arrayList.get(elements / 2);
        end = System.nanoTime();
        System.out.println("ArrayList access time: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedList.get(elements / 2);
        end = System.nanoTime();
        System.out.println("LinkedList access time: " + (end - start) + " ns");

        // Eliminar elementos
        start = System.nanoTime();
        arrayList.remove(elements / 2);
        end = System.nanoTime();
        System.out.println("ArrayList removal time: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedList.remove(elements / 2);
        end = System.nanoTime();
        System.out.println("LinkedList removal time: " + (end - start) + " ns");
    }
}
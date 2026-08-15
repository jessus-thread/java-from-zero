import java.util.*;

public class ListPerformance {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        /*
            The underscore symbol (_) is used to make reading easier, since
            we can easily recognize that it is one hundred thousand.
        */
        int elements = 100_000;

        // Insert at the end
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

        // Access items
        start = System.nanoTime();
        arrayList.get(elements / 2);
        end = System.nanoTime();
        System.out.println("ArrayList access time: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedList.get(elements / 2);
        end = System.nanoTime();
        System.out.println("LinkedList access time: " + (end - start) + " ns");

        // Delete items
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
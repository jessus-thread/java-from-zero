package com.devtalles.datastructure.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleIterators {
    static void main() {
        List<String> names = new ArrayList<>();

        names.add("Gabriel");
        names.add("Jessica");
        names.add("Arami");
        names.add("Rafael");
        names.add("Jesús");
        names.add("Carlos");

       /*
            A forEach internally uses an iterator, which throws an error
            because the iterator is unaware of modifications, and on the
            second iteration it detects the unexpected modification and
            throws the error.

            It is important to know that forEach does not support modifications
            while traversing the collection, and it is a bad practice to try
            to do so.
        */

//        for (String name : names) {
//            if (name.startsWith("A") || name.startsWith("C")) {
//                names.remove(name);
//            }
//        }

        // The solution to the previous problem is to use an iterator directly.
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();

            if(name.startsWith("A") || name.startsWith("C")) {
               /*
                    We use the iterator instead of the collection so that
                    the iterator is aware of the modification. It is important
                    not to use the collection to modify it directly because
                    it is a bad practice.

                    We can only remove items, not add them.
                */
                iterator.remove();
            }
        }

        System.out.println(names);
    }
}

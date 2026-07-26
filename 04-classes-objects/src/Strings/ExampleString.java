package Strings;

public class ExampleString {
    public static void main(String[] args) {
        String name = "jessus.https";
        String name2 = "jessus.https";
        String name3 = new String("jessus.https");

        /*
            It is important to know that the == operator does not compare the value
            itself, it compares the memory space.

            As we can see in the comparison result below, it returns true when it
            should return false because, in theory, they are different memory spaces.
            However, this happens thanks to Java's "string pool." When Java detects that
            a string that already exists is assigned to another variable, Java doesn't
            create another memory space with a new string; instead, it points to the
            same string (memory space).
        */

        System.out.println("name & name2 are equal: " + (name == name2));

        /*
            In the following evaluation we would think it would return true, but when
            I create a string using new String, another space in memory will always be
            created even if the string already exists 1000 times; in this case, the
            "string pool" is not used.
        */
        System.out.println("name & name3 are equal: " + (name == name3));

        Person person = new Person("jessus", "thread");

        System.out.println(person.toString());
    }
}

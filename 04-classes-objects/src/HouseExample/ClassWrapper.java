package HouseExample;

public class ClassWrapper {
    public static void main(String[] args) {
        /*
            Wrapper classes are classes that enclose primitive data types to transform them into objects,
            that is, into classes. This has an advantage because classes have methods, thus adding more
            useful functionality.

            It is important to know that each primitive data type has its respective wrapper class.
        */

        int numberOne = 20;

        /*
            The valueOf function returns the value itself; it is the same as assigning the value directly
            to the variable.
        */
        Integer numberTwo = Integer.valueOf(30);
        Integer numberThree = 30;

        System.out.println("numberOne: " + numberOne);
        System.out.println("numberTwo: " + numberTwo);
        System.out.println("numberThree: " + numberThree);

        System.out.println("" + numberThree.toString().length());
    }
}

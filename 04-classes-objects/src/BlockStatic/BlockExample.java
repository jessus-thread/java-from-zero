package BlockStatic;

public class BlockExample {
    /*
        What exactly is a static block?

        It is a block of pure code that is automatically and uniquely executed
        at the exact moment that the ClassLoader (the Java Virtual Machine class
        loader) uploads your class to RAM (to the Metaspace), long before the
        first object is created

        A static block is executed only once before the properties are
        initialized, before the main method is executed.

        Exact lifecycle of a class (execution order)

        1. Static variables: they are allocated in memory
        2. Static block(s): they execute from top to bottom. (you
            can have more than one and the same class.)
        3. Main method or static methods: the program begins to run
        4. Instance initialization blocks: (blocks without the word 'static')
        5. Constructor: it executes only when you use the word 'new'

        Critical Error Handling: If a static block throws a checked exception
        (one that Java requires you to catch), you must handle it internally
        using a try-catch block. If an exception escapes the static block, the
        Virtual Machine throws a catastrophic error called `ExceptionInInitializerError`,
        rendering the class unusable for the entire lifecycle of the application

        Lazy loading: java classes are not all loaded when the program starts up;
        they are loaded on demand. A class's static block executes only the first
        time you attempt to use that class (whether by instantiating it or by calling
        one of its static methods)
     */
    static {
        System.out.println("Block static execute...");
    }

    public static void main(String[] args) {
        System.out.println("Execute hello world");
    }
}

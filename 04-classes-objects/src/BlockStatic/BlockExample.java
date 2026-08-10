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
     */
    static {
        System.out.println("Block static execute...");
    }

    public static void main(String[] args) {
        System.out.println("Execute hello world");
    }
}

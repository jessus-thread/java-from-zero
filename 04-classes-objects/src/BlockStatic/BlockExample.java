package BlockStatic;

public class BlockExample {
    /*
        Un bloque estatico se ejecute una sola vez antes de que se inicializen
        las propiedades, antes de que se ejecute el metodo main.
     */
    static {
        System.out.println("Block static execute...");
    }

    public static void main(String[] args) {
        System.out.println("Execute hello world");
    }
}

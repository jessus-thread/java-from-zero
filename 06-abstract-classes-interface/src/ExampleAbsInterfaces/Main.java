package ExampleAbsInterfaces;

public class Main {
    // Clases anonimas
    public static void main(String[] args) {
        /*
            Como bien sabemos no se puede instancia una clase abstracta
            pero si podemos con una clase anonima que de declara e instancia
            en una sola linea, generalmente para sobreescribir metodos de
            una interfaz o clase abstracta
         */
        Vehicle vehicle = new Vehicle("Fiat", "Duna", 2000) {
            @Override
            public void drive() {
                System.out.println("Driving Vehicle");
            }
        };

        System.out.println(vehicle.toString());
    }
}

/*
    De esta manera aplicamos herencia, Car extiende de la clase
    Vehicle, es decir, va heredar propiedades y metodos de la
    clase padre que es Vehicle.

    Las clases solo pueden heredar de una clase de manera directa.

    A esto se le llama relacion de herencia, por que Car hereda
    metodos y propiedades
 */
public class Car extends Vehicle{
    /*
        Relacion de compocision, para saber esto podemos
        hacernos la siguiente pregunta ¿Car tiene puertas?
        si la respuesta es si es por que existe una relacion
        de compocision ya que car esta compuesta de 2 a 4
        puertas
     */
    private int doors;
    private Engine engine;

    public Car(String brand, String model, int year, int doors) {
        /*
            De esta manerá establecemos valores a las propiedades
            heredadas del padre llamando al metodo super.
         */
        super(brand, model, year);

        this.doors = doors;
        this.engine = new Engine();
    }

    /*
        El segundo tipo de polimorfismo que es en tiempos de ejecución
        se llama sobreescritura de metodos.
     */
    public void start() {
        System.out.println("The car is start - override");
        this.engine.start();
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                '}' + super.toString();
    }
}

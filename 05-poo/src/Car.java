/*
    De esta manera aplicamos herencia, Car extiende de la clase
    Vehicle, es decir, va heredar propiedades y metodos de la
    clase padre que es Vehicle.

    Las clases solo pueden heredar de una clase de manera directa.
 */
public class Car extends  Vehicle{
    private int doors;

    public Car(String brand, String model, int year, int doors) {
        /*
            De esta manerá establecemos valores a las propiedades
            heredadas del padre llamando al metodo super.
         */
        super(brand, model, year);

        this.doors = doors;
    }

    /*
        El segundo tipo de polimorfismo que es en tiempos de ejecución
        se llama sobreescritura de metodos.
     */
    @Override
    public void start() {
        System.out.println("The car is start - override");
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}

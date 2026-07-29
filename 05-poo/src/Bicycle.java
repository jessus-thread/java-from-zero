/*
    Al utilizar la herencia debemos tener en cuenta que
    al usarlo tiene un costo, ya que por ejemplo la clase
    Bicycle es un vehiculo pero no debería tener los metodos
    de start y stop ya que no tiene motor, esta heredando
    metodos que no utiliza, pero no podemos borrar los metodos
    stop y start de clase padre ya que afectariamos a la clase
    Car y Motorcycle, la solucion es la compocision
 */
public class Bicycle extends Vehicle {
    private boolean hasBeell;

    public Bicycle(String brand, String model, int year, boolean hasBeell) {
        super(brand, model, year);
        this.hasBeell = hasBeell;
    }
}

/*
    In this way, we apply inheritance. `Car` extends the `Vehicle` class; that is,
    it will inherit properties and methods from its parent class, `Vehicle`.

    Classes can only inherit directly from one other class.

    This is called an inheritance relationship because `Car` inherits methods
    and properties.
 */
public class Car extends Vehicle{
    /*
        Composition relationship: To determine this, we can ask ourselves the following
        question: Does a car have doors?

        If the answer is yes, it's because there is a composition relationship, since
        a car is composed of 2 to 4 doors.
     */
    private int doors;
    private Engine engine;

    public Car(String brand, String model, int year, int doors) {
        /*
            In this way we set values ​​for the properties
            inherited from the parent by calling the super method.
         */
        super(brand, model, year);

        this.doors = doors;
        this.engine = new Engine();
    }

    /*
       The second type of polymorphism, which occurs at runtime,
        is called method overriding.
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

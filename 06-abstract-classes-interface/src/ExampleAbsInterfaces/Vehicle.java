package ExampleAbsInterfaces;

/*
    Abstract classes are created to be inherited; that is,
    they cannot be instantiated directly.

    Note on anonymous classes: Although it may seem like they are instantiated
    when using an anonymous class, Java actually creates an unnamed subclass
    at runtime and THAT subclass is what gets instantiated.

    Their main purpose is to serve as a base template for other classes.

    Abstract classes can combine two things:
    1. Abstract methods (signature only): They force child classes to
        implement this behavior (they act as a contract).
    2. Concrete methods (with executable code): Base behavior
        that all child classes inherit and can use directly.

    What is the purpose of the constructor if the class cannot be instantiated?
    The constructor exists to initialize the state (attributes) of
    this base class. Child classes have the responsibility to invoke it
    using the super() method.
 */
public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;
    // This is how they use enums.
    private Color color;
    private VehicleStatus vehicleStatus;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Vehicle(String brand, String model, int year, Color color, VehicleStatus vehicleStatus) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.vehicleStatus = vehicleStatus;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int currentYear = java.time.Year.now().getValue();

        if (year < 1886 || year > currentYear + 2) {
            throw new IllegalArgumentException("Year out of range");
        }

        this.year = year;
    }

    /*
        The 'abstract' keyword in a method indicates that it has no
        implementation (code body). It works like interfaces:
        it establishes a mandatory rule stating that child classes
        must override and implement this method.
    */
    public abstract void drive();

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color=" + color +
                ", vehicleStatus=" + vehicleStatus +
                '}';
    }
}
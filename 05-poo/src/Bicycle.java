/*
    When using inheritance, we must keep in mind that
    its use comes at a cost, since, for example, the Bicycle class
    is a vehicle but shouldn't have the start and stop methods
    since it doesn't have an engine. It's inheriting
    methods it doesn't use, but we can't delete the stop and start methods
    from the parent class because we would affect the Car and Motorcycle classes.
    The solution is composition.
 */
public class Bicycle extends Vehicle {
    private boolean hasBeell;

    public Bicycle(String brand, String model, int year, boolean hasBeell) {
        super(brand, model, year);
        this.hasBeell = hasBeell;
    }
}

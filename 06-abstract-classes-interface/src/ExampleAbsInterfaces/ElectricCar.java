package ExampleAbsInterfaces;

/*
    We can implement multiple interfaces in a single class; interfaces do not share
    a parent-child relationship with classes—for instance, a "fly" interface could
    apply to a bird, a superhero, or an airplane—whereas abstract classes do involve
    a parent-child relationship.
 */
public class ElectricCar extends Vehicle implements Electric, SelfDriving {
    private int batteryLevel;

    public ElectricCar(String brand, String model, int year, int batteryLevel) {
        super(brand, model, year);
        this.batteryLevel = batteryLevel;
    }

    public ElectricCar(String brand, String model, int year, Color color, VehicleStatus vehicleStatus, int batteryLevel) {
        super(brand, model, year, color, vehicleStatus);
        this.batteryLevel = batteryLevel;
    }

    /*
       We override the method declared as abstract in the abstract class.
     */
    @Override
    public void drive() {
        System.out.println("The electric car is underway.");
    }

    @Override
    public void chargeBattery() {
        this.batteryLevel = MAX_BATTERY_CAPACITY;

        System.out.println(this.batteryLevel);
    }

    @Override
    public void activateAutopilot() {
        System.out.println("Autopilot mode activated");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryLevel=" + batteryLevel +
                '}' + super.toString();
    }
}

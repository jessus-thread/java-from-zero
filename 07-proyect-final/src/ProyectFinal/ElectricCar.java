package ProyectFinal;

public class ElectricCar extends Car implements Electric {
    private int batteryLevel;

    public ElectricCar(String brand, String model, int year, CarType carType, int batteryLevel) {
        super(brand, model, year, carType);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void start() {
        System.out.println("The electric car is on...");
    }

    @Override
    public void chargeBattery() {
        this.batteryLevel = 100;

        System.out.println("The battery is 100% charged...");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryLevel=" + batteryLevel +
                '}' + super.toString();
    }
}

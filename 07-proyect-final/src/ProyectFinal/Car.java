package ProyectFinal;

public class Car extends Vehicle {
    private CarType carType;

    public Car(String brand, String model, int year, CarType carType) {
        super(brand, model, year);

        this.carType = carType;
    }

    @Override
    public void start() {
        System.out.println("The car started...");
    }

    @Override
    public String toString() {
        return super.toString() + " Type: " + this.carType;
    }
}

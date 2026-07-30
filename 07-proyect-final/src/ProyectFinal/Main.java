package ProyectFinal;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota", "Supra", 2026, CarType.SPORTS);
        Vehicle myElectricCar = new ElectricCar("Tesla", "Model 3", 2025, CarType.SPORTS, 95);

        myCar.start();
        myElectricCar.start();

        ((ElectricCar)myElectricCar).chargeBattery();

        System.out.println(myCar);
        System.out.println(myElectricCar);
    }
}

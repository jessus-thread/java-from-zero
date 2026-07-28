public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Fiat", "Duna", 2000);

        vehicle.setBrand("Toyota");
        vehicle.setModel("Supra");
        vehicle.setYear(2018);

        System.out.println(vehicle.toString());

        Car myCar = new Car("Toyota", "Corolla", 2021, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 2021, false);

        myCar.start();
        motorcycle.start();
    }
}

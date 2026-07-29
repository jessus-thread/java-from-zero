public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Fiat", "Duna", 2000);

        vehicle.setBrand("Toyota");
        vehicle.setModel("Supra");
        vehicle.setYear(2018);

        System.out.println(vehicle.toString());

        /*
            El polimorfismo de inclusion se basa en tipar a las clases hijas
            como clases de la super clase
         */
        Vehicle myCar = new Car("Toyota", "Corolla", 2021, 4);
        Vehicle motorcycle = new Motorcycle("Honda", "CBR", 2021, false);

        myCar.start();
        motorcycle.start();

        printVehicle(myCar);

        /*
            Castemos para poder acceder a los setters creados en la clase Car
         */
        ((Car)myCar).setDoors(5);

        printVehicle(myCar);
    }

    /*
        Polimorfismo de inclusion, logramos que nuestro codigo sea mas flexible,
        ya que ambos son vehiculos
     */
    public static void printVehicle(Vehicle vehicle) {
        System.out.println(vehicle.toString());
    }
}

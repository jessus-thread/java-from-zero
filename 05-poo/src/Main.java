public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Fiat", "Duna", 2000);

        vehicle.setBrand("Toyota");
        vehicle.setModel("Supra");
        vehicle.setYear(2018);

        System.out.println(vehicle.toString());
    }
}

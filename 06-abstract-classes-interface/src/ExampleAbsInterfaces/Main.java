package ExampleAbsInterfaces;

public class Main {
    // Anonymous classes
    public static void main(String[] args) {
        /*
           As we know, you cannot instantiate an abstract class, but you can do so
           using an anonymous class that is declared and instantiated in a single
           line, typically to override methods of an interface or an abstract class.
         */
        
//        Vehicle vehicle = new Vehicle("Fiat", "Duna", 2000) {
//            @Override
//            public void drive() {
//                System.out.println("Driving Vehicle");
//            }
//        };
//
//        System.out.println(vehicle.toString());

        Vehicle electric =
                new ElectricCar("Fiat", "Duna", 2025, Color.BLUE, VehicleStatus.AVAILABLE, 80);

        System.out.println(electric.toString());
    }
}

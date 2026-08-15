public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Fiat", "Duna", 2000);

        vehicle.setBrand("Toyota");
        vehicle.setModel("Supra");
        vehicle.setYear(2018);

        System.out.println(vehicle.toString());

        /*
            Inclusion polymorphism is based on typing child classes
            as classes of the superclass
         */
        Vehicle myCar = new Car("Toyota", "Corolla", 2021, 4);
        Vehicle motorcycle = new Motorcycle("Honda", "CBR", 2021, false);

        /*
            We cast the `myCar` objects to use the `start()` methods; we do not change
            the data type directly in the variable, as that is methodologically incorrect.
         */
        ((Car)myCar).start();
        ((Motorcycle)motorcycle).start();

        printVehicle(myCar);

        /*
            Let's cast to access the setters created in the Car class
         */
        ((Car)myCar).setDoors(5);

        printVehicle(myCar);
    }

    /*
        What is Inclusion Polymorphism?

        In type theory, inclusion polymorphism (also known as subtyping polymorphism or simply subtyping) is a language's ability to allow an object of a child class (subtype) to be used wherever an object of its parent class (supertype) is expected.

        The word "inclusion" comes from set theory: the set of child classes is included within the set of the parent class.

        For this type of polymorphism to exist, two things are strictly required:
        1. Inheritance (using `extends`) or Interface Implementation (using `implements`).
        2. Upcasting (storing a child object in a variable of the parent type).

        The Liskov Substitution Principle (SOLID)

        In professional engineering circles, we call this by its formal name: the Liskov Substitution Principle (the "L" in the famous SOLID architectural principles).

        This principle states: "If S is a subtype of T, then objects of type T may be replaced with objects of type S without altering the program's correctness."

        In plain English: If your method requires a Parent, you can pass it any Child, and the program shouldn't crash.
     */
    public static void printVehicle(Vehicle vehicle) {
        System.out.println(vehicle.toString());
    }
}

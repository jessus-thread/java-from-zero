package HouseExample;

public class House {
    /*
        Access modifiers help us encapsulate information and protect our data within a class.

        Without a doubt, access modifiers are related to a key programming concept called
        encapsulation.

        Mastering this concept is key to creating robust and secure software because it
        allows us to control access to the attributes and methods of our class.

        It is important to know that when we do not use an access modifier on a
        property/method, by default it is protected.

        The protected attribute is used to protect properties/methods and allows
        them to be accessed by other classes within the same package.
     */

    private int doors;
    private int windows;
    private double size;

    /*
        A constructor is a special method used to initialize an object of a class; that is,
        it is responsible for establishing the initial state of the object and initializing
        its attributes.

        Classes have an empty constructor by default.

        A class can have multiple constructors; in programming, this is known as constructor
        overloading. The key difference is that constructors request different parameters,
        and Java knows which constructor to call depending on the parameters passed to it.
        It's important that the parameters are different so that Java knows which constructor
        to use.

        In Java, the word This refers to the current object, that is, the object that is being
        created.

        The advantages of initializing attributes with constructors:
            - Consistency: Ensures that objects are created with a valid state from the start.
            - Flexibility: Allows you to create objects with different configurations depending
                on the need.
            - Encapsulation: We centralize the logic of initializing attributes and protect
                the attributes from being modified directly from outside the class.
    */
    public House() {}

    public House(int doors, int windows, double size) {
        this.doors = doors;
        this.windows = windows;
        this.size = size;
    }

    public void openDoor() {
        System.out.println("Open door");
    }

    public double calculateArea() {
        return size * size;
    }

    /*
        Getters have direct access to the properties of a class and are public,
        so they can be accessed from outside the class.

        This allows us to control how properties are accessed; we can even perform
        operations before returning them.
     */
    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public double getSize() {
        return size;
    }

    /*
        Setters have direct access to the properties of a class and are public,
        so they can be accessed from outside the class.

        This allows us to control how properties are modified; we can even perform
        operations before modifying them.
     */

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setSize(double size) {
        this.size = size;
    }
}

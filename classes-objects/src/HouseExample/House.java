package HouseExample;

public class House {
    int doors;
    int windows;
    double size;

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

    void openDoor() {
        System.out.println("Open door");
    }

    double calculateArea() {
        return size * size;
    }
}

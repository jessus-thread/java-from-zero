package ExampleAbsInterfaces;

/*
    Interfaces are contracts that must be fulfilled by classes implementing them.

    They do not have constructors or implemented methods.

    While having attributes in interfaces is uncommon, it is possible.

    They can only contain public, static constants; these constants cannot be modified.
 */
public interface Electric {
    int MAX_BATTERY_CAPACITY = 100;

    /*
        Specifying `public` is redundant, since it is understood that any class
        implementing this interface will be able to override these methods.
     */

    void chargeBattery();
}

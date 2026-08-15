/*
    We use the Engine class to apply the composition, since not all vehicles have an engine.
 */
public class Engine {
    /*
        The first type of polymorphism, overloading, which is evaluated
        at compile time, means that we can have many
        methods with the same name, but the signature that differentiates them
        is the number of parameters, the parameter data type, and
        the method's return value
     */
    public void start() {
        System.out.println("Starting Vehicle");
    }

    public void start(boolean silentMode) {
        System.out.println("Inside Vehicle start in mode: " + silentMode);
    }

    public void start(int silentMode) {
        System.out.println("Inside Vehicle start in mode: " + silentMode);
    }
}

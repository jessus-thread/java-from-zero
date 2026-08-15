package Immutability;

/*
    Class Immutability

    This means that once an instance of that class is created,
    its state cannot change. This means that all
    attributes will have the same value once created and
    cannot be changed.

    To create an immutable class, we need to
    make its attributes constant, place
    `final` before `class`, and not include setters.

    It's important to remember that immutable classes
    cannot be extended; that is, they cannot be inherited.
*/
public final class House {
    private final int doors;
    private final int windows;
    private final double size;

    public House(int doors, int windows, double size) {
        this.doors = doors;
        this.windows = windows;
        this.size = size;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public double getSize() {
        return size;
    }
}

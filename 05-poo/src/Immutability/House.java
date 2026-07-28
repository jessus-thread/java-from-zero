package Immutability;

/*
    La inmutabilidad de clase

    Significa que una vez creada una instancia de esa clase
    su estado no puede cambiar, eso quiere decir que todos
    los atributo tendran el mismo valor una vez creada y
    no se podrán cambiar.

    Para poder crear una clase inmutable necesitamos
    colocar como constantes sus atributos, colocar
    final antes de class y no ofrecer setters

    Es importante recordad que las clases inmutables
    no pueden ser extendidas, es decir, no pueden ser heredadas
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

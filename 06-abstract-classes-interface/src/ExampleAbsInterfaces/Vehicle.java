package ExampleAbsInterfaces;

/*
    Las clases abstractas se crean para ser heredadas; es decir,
    no se pueden instanciar directamente.

    Nota sobre clases anónimas: Aunque parezca que se instancian
    al usar una clase anónima, en realidad Java crea una clase hija
    sin nombre en tiempo de ejecución y es ESA clase hija la que se instancia.

    Su objetivo principal es servir como plantilla base para otras clases.

    Las clases abstractas pueden combinar dos cosas:
    1. Métodos abstractos (solo la firma): Obligan a las clases hijas a
       implementar dicho comportamiento (funcionan como un contrato).
    2. Métodos concretos (con código ejecutable): Comportamiento base
       que todas las clases hijas heredan y pueden utilizar directamente.

    ¿Para qué sirve el constructor si la clase no se puede instanciar?
    El constructor existe para inicializar el estado (los atributos) de
    esta clase base. Las clases hijas tienen la responsabilidad de invocarlo
    utilizando el método super().
 */
public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int currentYear = java.time.Year.now().getValue();

        if (year < 1886 || year > currentYear + 2) {
            throw new IllegalArgumentException("Year out of range");
        }

        this.year = year;
    }

    /*
        La palabra reservada 'abstract' en un método indica que no tiene
        implementación (cuerpo de código). Funciona como las interfaces:
        establece una regla obligatoria indicando que las clases hijas
        deben sobrescribir e implementar este método sí o sí.
     */
    public abstract void drive();

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
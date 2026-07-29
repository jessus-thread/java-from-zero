package ExampleAbsInterfaces;

/*
    Podemos implementar muchas interfaces en una clase,
    las interfaces no tienen una relacion de parentesco
    con las clases, es decir, si tenemos una interfaz
    "volar" puede aplicarse a un ave, a un super heroe,
    avion, las clases abstractas si tienen una relacion
    de parentezco
 */
public class ElectricCar extends Vehicle implements Electric, SelfDriving {
    private int batteryLevel;

    public ElectricCar(String brand, String model, int year, int batteryLevel) {
        super(brand, model, year);

        this.batteryLevel = batteryLevel;
    }

    /*
            Sobreescribimos el metodo que declaramos como abstract
            en la clase abstracta
         */
    @Override
    public void drive() {
        System.out.println("El auto eléctrico está en marcha");
    }

    @Override
    public void chargeBattery() {
        this.batteryLevel = MAX_BATTERY_CAPACITY;

        System.out.println(this.batteryLevel);
    }

    @Override
    public void activateAutopilot() {
        System.out.println("Modo piloto automático activado");
    }
}

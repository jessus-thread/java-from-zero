public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    /*
        El primer tipo de polimortfismo que es sobrecarga que se evalua
        en tiempos de compilación quiere decir que podemos tener muchos
        métodos que se llamen igual pero la firma que los va a diferenciar
        es la cantidad de parametros, el tipo de dato del parametro y
        el retorno del metodo
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

    public void stop() {
        System.out.println("Stopping Vehicle");
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
            throw  new IllegalArgumentException("Invalid year");
        }

        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

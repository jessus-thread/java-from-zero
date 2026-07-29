public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Fiat", "Duna", 2000);

        vehicle.setBrand("Toyota");
        vehicle.setModel("Supra");
        vehicle.setYear(2018);

        System.out.println(vehicle.toString());

        /*
            El polimorfismo de inclusion se basa en tipar a las clases hijas
            como clases de la super clase
         */
        Vehicle myCar = new Car("Toyota", "Corolla", 2021, 4);
        Vehicle motorcycle = new Motorcycle("Honda", "CBR", 2021, false);

        myCar.start();
        motorcycle.start();

        printVehicle(myCar);

        /*
            Castemos para poder acceder a los setters creados en la clase Car
         */
        ((Car)myCar).setDoors(5);

        printVehicle(myCar);
    }

    /*
        ¿Qué es el Polimorfismo de Inclusión?

        En la teoría de tipos, el polimorfismo de inclusión (también conocido como polimorfismo
        de subtipado o Subtyping) es la capacidad que tiene el lenguaje para permitir que un objeto
        de una clase hija (subtipo) pueda ser utilizado en cualquier lugar donde se espere un objeto
        de su clase padre (supertipo).

        La palabra "inclusión" viene de la teoría de conjuntos: el conjunto de las clases hijas está
        incluido dentro del conjunto de la clase padre.

        Para que este polimorfismo exista, se necesitan dos cosas obligatoriamente:
            1. Herencia (usando extends) o Implementación de Interfaces (usando implements).
            2. Upcasting (que es cuando guardas a un hijo en una variable de tipo padre).

        El Principio de Sustitución de Liskov (SOLID)

        En las grandes ligas de la ingeniería, a esto le llamamos por su nombre formal: El Principio
        de Sustitución de Liskov (la letra "L" de los famosos principios SOLID de arquitectura).

        Este principio dicta que: "Si S es un subtipo de T, entonces los objetos de tipo T pueden ser
        sustituidos por objetos de tipo S sin alterar las propiedades correctas del programa".

        En cristiano: Si tu método pide un Padre, puedes mandarle cualquier Hijo, y el programa no debe explotar.
     */
    public static void printVehicle(Vehicle vehicle) {
        System.out.println(vehicle.toString());
    }
}

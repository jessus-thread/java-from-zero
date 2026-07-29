/*
    La clase Engine la usamos para aplicar la compocisión,
    ya que no todos los vehiculos tienen motor.
 */
public class Engine {
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
}

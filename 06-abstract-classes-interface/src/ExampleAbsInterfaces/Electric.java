package ExampleAbsInterfaces;

/*
    Las interfaces son contratos y deben cumplirse por clases
    que implementen esta interfaz.

    No tienen constructores, no tienen metodos implementados

    No es común tener atributos en las interfaces pero es posible

    Solo podemos tener constantes staticas y publicas, las
    constantes no las podemos modifica
 */
public interface Electric {
    int MAX_BATTERY_CAPACITY = 100;

    /*
        poner public es redundante, ya que se entiende
        que todas las clases que implementen esta interfaz
        van a poder sobreescribir estos metodos
     */

    void chargeBattery();
}

package relations;

public class Person {
    /*
        Relación de dependencia

        En el mundo de UML y la POO, la dependencia (a menudo llamada relación "usa un" o uses-a)
        es la relación más débil y efímera que puede existir entre dos clases.

        Decimos que la Clase A depende de la Clase B si un cambio en la estructura o comportamiento
        de la Clase B obliga a modificar la Clase A. Es decir, A "conoce" a B y la necesita para
        realizar una tarea específica, pero B no forma parte del estado (atributos) de A.

        A diferencia de la Asociación o la Composición (donde una clase guarda a la otra en una
        variable de instancia o atributo para usarla a largo plazo), la dependencia es temporal.
        La usas, hace su trabajo y te olvidas de ella.

        ¿Cómo se ve la Dependencia en el código Java?

        Como Tech Lead, cuando hago code reviews, identifico una relación de
        dependencia pura cuando veo a la Clase B apareciendo en la Clase A
        de una de estas cuatro formas:

        - Como parámetro de un método: La Clase A recibe un objeto de la Clase
            B para operar con él.
        - Como variable local: La Clase A instancia (hace un new) de la Clase B
            dentro del bloque de un método.
        - Como tipo de retorno: Un método de la Clase A devuelve un objeto de la Clase B.
        - Llamada estática: La Clase A invoca un método estático de la Clase B (por ejemplo,
            cuando usas Math.max() o utilerías).

        Aquí es donde entra la experiencia en empresas grandes. Las dependencias no son malas,
        de hecho, son inevitables (un programa sin dependencias es un programa que no hace nada).
        El problema es el grado de acoplamiento.

        Cuando haces new ValidadorRed() dentro del método (dependencia por variable local), estás
        creando un acoplamiento fuerte (tight coupling). Estás "casando" a tu ProcesadorPagos con
        la implementación exacta de ValidadorRed.

        ¿El problema? Cuando quieras escribir pruebas unitarias para ProcesadorPagos, no vas a poder
        falsear (mockear) esa red. El código siempre intentará conectarse a la red real porque el new
        está clavado ahí adentro (hardcodeado).

        Por eso, a nivel de arquitectura, siempre buscamos transformar estas dependencias locales en
        Asociaciones inyectadas a través del constructor, utilizando frameworks como Spring Boot
        (lo que conocerás como Inyección de Dependencias). Pero a nivel de POO puro, cualquier uso
        temporal de un objeto es una relación de dependencia.
    */
    public void calculateSum(Calculator calculator) {
        int result = calculator.add(20, 30);

        System.out.println(result);
    }
}

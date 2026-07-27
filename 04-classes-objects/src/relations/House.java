package relations;

public class House {
    /*
        Relacion fuerte, esto se denomina relacion de compocision,
        ya que si se detruye la casa, tambien se detruye room y door

        ¿Qué es la Relación de Composición?
        La Composición es un tipo específico y estricto de Asociación
        (una relación "tiene un" o has-a), pero con dos reglas inquebrantables:

        1. Dependencia total del ciclo de vida: El objeto "hijo" (la parte) no
        tiene sentido ni puede existir sin el objeto "padre" (el todo). Si
        el padre es destruido por el Garbage Collector, todas sus partes deben
        ser destruidas con él.

        2. Propiedad exclusiva: El objeto hijo le pertenece a un único padre a
        la vez. No puede ser compartido con otros objetos.

        ¿Cómo se ve la Composición en código Java?
        Para garantizar esta exclusividad y control del ciclo de vida, la clase
        padre suele ser responsable de instanciar a sus clases hijas, en lugar de
        recibirlas ya creadas desde el exterior.

        Imagina un sistema de facturación. Una Factura está compuesta por LineasDeFactura
        (los productos que estás cobrando). Una línea de factura no tiene razón de existir
        por sí sola en el sistema si no pertenece a una factura específica.

        import java.util.ArrayList;
        import java.util.List;

        // El "Todo" (Clase Padre)
        public class Factura {
            private String folio;
            private String cliente;
            
            // El padre encapsula y es dueño exclusivo de la colección
            private final List<LineaFactura> lineas;

            public Factura(String folio, String cliente) {
                this.folio = folio;
                this.cliente = cliente;
                // La Composición nace aquí: el padre crea la estructura.
                this.lineas = new ArrayList<>(); 
            }

            // Fíjate en esto: No recibimos un objeto LineaFactura ya creado.
            // Recibimos los datos puros y el PADRE asume la responsabilidad de instanciarlo.
            public void agregarProducto(String producto, int cantidad, double precio) {
                LineaFactura nuevaLinea = new LineaFactura(producto, cantidad, precio);
                this.lineas.add(nuevaLinea);
            }
            
            // Método para simular la destrucción lógica
            public void anularFactura() {
                // Al vaciar la lista y eventualmente destruir la Factura, 
                // las LineasFactura quedan sin referencias y el Garbage Collector las elimina.
                this.lineas.clear();
            }

            // La "Parte" (Clase Hija)
            // A menudo, en Java, hacemos la clase hija privada e interna (Inner Class) 
            // para forzar al máximo que nadie más fuera de Factura pueda instanciarla.
            private class LineaFactura {
                private String producto;
                private int cantidad;
                private double precio;

                public LineaFactura(String producto, int cantidad, double precio) {
                    this.producto = producto;
                    this.cantidad = cantidad;
                    this.precio = precio;
                }
            }
        }

        Patrón de Arquitectura: Aggregate Root
        En arquitecturas avanzadas, a la clase padre en una relación de composición se le llama
        Aggregate Root (Raíz del Agregado). La regla de arquitectura dicta que otros componentes
        del sistema no pueden interactuar directamente con las partes (hijos), sino que deben
        pedirle siempre todo a la Raíz. No buscas una "Línea de Factura" en la base de datos,
        buscas la "Factura" y ella te entrega sus líneas.
    */
    private Room room; 
    private Door door;

    /*
        Relacion debil

        Tipo de relación de asociación, ya que pueden existir
        independientemente del otro, si se destruye la casa
        no se destruye el propietario.

        Mejor explicación:

        En la Programación Orientada a Objetos, decimos que hay una Asociación cuando una
        clase "tiene un" o "conoce a" otro objeto de una clase diferente, y lo guarda como
        parte de su estado (como un atributo/variable de instancia).

        A diferencia de la dependencia, que nace y muere dentro de la ejecución de un método,
        la asociación sobrevive mientras el objeto que la contiene siga existiendo en memoria.

        La regla de oro de la asociación genérica es la independencia de los ciclos de vida.
        Si la Clase A se destruye (es recogida por el Garbage Collector), la Clase B puede
        seguir existiendo perfectamente por su cuenta. No dependen vitalmente la una de la
        otra para tener sentido.

        1. Asociación Unidireccional
        La Clase A conoce a la Clase B, pero la Clase B no tiene idea de que la Clase A existe.
        Como ingenieros, esta es la que siempre debemos preferir por defecto, ya que mantiene
        el acoplamiento bajo.

        Nota que si elimino al Desarrollador, el objeto Credencial podría seguir existiendo y
        asignarse a otro empleado.

        2. Asociación Bidireccional
        Ambas clases se conocen mutuamente. Tienen atributos que apuntan a la otra.

        public class Empleado {
            private String nombre;
            private Departamento departamento; // Conoce a Departamento
        }

        public class Departamento {
            private String area;
            private List<Empleado> empleados;  // Conoce a Empleado (Multiplicidad 1 a Muchos)
        }

        En las pizarras de arquitectura de Microsoft o Google, rara vez dibujamos una caja y una
        flecha sin cuestionarla. Cuando estableces una asociación, especialmente bidireccional,
        te enfrentas a tres retos de ingeniería reales:

        1. Ciclos infinitos en Serialización (El terror de las APIs REST):
        Si estás devolviendo el objeto Departamento en un endpoint (en formato JSON), el serializador
        leerá el Departamento, luego irá a su lista de Empleados, entrará al primer Empleado, este
        lo mandará de vuelta al Departamento, y así hasta que tu servidor colapse con un StackOverflowError.
        (Por eso usamos anotaciones como @JsonIgnore en Java o rompemos las referencias circulares).

        2. Gestión de Memoria:
        En Java, el recolector de basura (Garbage Collector) no elimina un objeto si hay una referencia
        activa apuntando hacia él. Si creas muchas asociaciones innecesarias que se quedan guardadas en
        atributos a nivel de clase, estás reteniendo objetos en memoria que quizás ya no necesitas.

        3. Inyección de Dependencias (El estándar de la industria):
        Casi todos los frameworks modernos de Backend (como Spring Boot en Java o Nest.js en el
        ecosistema TS/Node) basan su arquitectura en asociaciones. Cuando inyectas un Servicio
        o un Repositorio en el constructor de tu Controlador, estás creando una Asociación.
        El framework se encarga de crear el Servicio una vez (como Singleton) y lo asocia a tu
        Controlador para que lo use cuando lo necesite.
    */
    private Owner owner;

    public House(Room room, Door door, Owner owner) {
        this.room = room;
        this.door = door;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "House [room=" + room + ", door=" + door + ", owner=" + owner + "]";
    }
}

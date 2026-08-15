package relations;

public class House {
    /*
        A strong relationship—this is known as a composition relationship—
        because if the house is destroyed, the room and door are destroyed as well.

        What is a Composition Relationship? 
        Composition is a specific and strict type of Association
        (a "has-a" relationship), but with two unbreakable rules:

        1. Total lifecycle dependency: The "child" object (the part)
        has no meaning and cannot exist without the "parent" object (the whole). If
        the parent is destroyed by the Garbage Collector, all its parts must
        be destroyed along with it. 

        2. Exclusive ownership: The child object belongs to only one parent
        at a time. It cannot be shared with other objects. 

        What does Composition look like in Java code? 
        To ensure this exclusivity and control over the lifecycle, the parent
        class is usually responsible for instantiating its child classes, rather than
        receiving them already created from the outside. 

        Imagine a billing system. An Invoice is composed of InvoiceLines
        (the products being billed). An invoice line has no reason to exist
        on its own in the system if it does not belong to a specific invoice.

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

        Architectural Pattern: Aggregate Root

        In advanced architectures, the parent class in a composition relationship is
        called the Aggregate Root. The architectural rule dictates that other system
        components cannot interact directly with the parts (children); instead, they
        must always make requests to the Root. You do not look for an "Invoice Line"
        in the database; you look for the "Invoice," and it provides its lines to you.
    */
    private Room room; 
    private Door door;

    /*
        Weak Association

        A type of association relationship where the entities can exist independently of one another;
        for instance, if the house is destroyed, the owner is not destroyed.

        Best explanation:

        In Object-Oriented Programming, an association exists when a class "has" or "knows" another object
        of a different class and stores it as part of its state (as an attribute or instance variable).

        Unlike a dependency—which arises and ceases to exist within the execution of a method—an association
        persists as long as the containing object remains in memory.

        The golden rule of generic association is the independence of lifecycles.If Class A
        is destroyed (collected by the Garbage Collector), Class B can continue to exist perfectly
        well on its own. They do not vitally depend on each other to make sense.

        1. Unidirectional Association
        Class A knows about Class B, but Class B has no idea that Class A exists. As engineers,
        this is the type we should always prefer by default, as it keeps coupling low.

        Note that if I delete the Developer, the Credential object could still exist and be assigned
        to another employee.

        2. Bidirectional Association
        Both classes know about each other. They have attributes that point to one another.

        public class Empleado {
            private String nombre;
            private Departamento departamento; // Conoce a Departamento
        }

        public class Departamento {
            private String area;
            private List<Empleado> empleados;  // Conoce a Empleado (Multiplicidad 1 a Muchos)
        }

        On Microsoft or Google architecture whiteboards, we rarely draw a box and an arrow without
        questioning it. When you establish an association, especially a bidirectional one, you face
        three real engineering challenges:

        1. Infinite Serialization Loops (The Dread of REST APIs):

        If you're returning the Department object to an endpoint (in JSON format), the serializer
        will read the Department, then go to its list of Employees, enter the first Employee, this
        will send it back to the Department, and so on until your server crashes with a StackOverflowError.

        (That's why we use annotations like @JsonIgnore in Java or break circular references.)

        2. Memory Management:

        In Java, the garbage collector doesn't remove an object if there's an active reference pointing to it.
        If you create many unnecessary associations that are stored in class-level attributes, you're holding
        onto objects in memory that you may no longer need.

        3. Dependency Injection (The Industry Standard):

        Almost all modern backend frameworks (such as Spring Boot in Java or Nest.js in the TS/Node ecosystem)
        base their architecture on associations. When you inject a Service or a Repository into your Controller's
        constructor, you are creating an Association.

        The framework takes care of creating the Service once (as a Singleton) and associates it with your
        Controller so that it can use it when needed.
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

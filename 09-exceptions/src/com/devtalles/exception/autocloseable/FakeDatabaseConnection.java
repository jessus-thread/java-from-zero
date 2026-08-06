package com.devtalles.exception.autocloseable;

/*
    La interfaz AutoCloseable permite que cualquier clase
    que la implemente pueda usarse con el try-with-resources
    y nos obliga a implementar el metodo close que cierra
    los recursos abiertos
*/
public class FakeDatabaseConnection implements AutoCloseable {
    public FakeDatabaseConnection() {
        System.out.println("Conexión a la base de datos establecida");
    }

    public void fetchData() {
        System.out.println("Obteniendo información de la base de datos.");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Conexión cerrada correctamente.");
    }
}

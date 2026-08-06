package com.devtalles.exception.autocloseable;

public class CustomResourceExample {
    static void main() {
        try (FakeDatabaseConnection connection = new FakeDatabaseConnection()) {
            connection.fetchData();

            /*
                No es ideal atrapar exceociones con el generico Exception,
                entre mas especifico mejor ya que de esta manera evitamos
                ocultar errores inesperados
             */
        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
        }
    }
}

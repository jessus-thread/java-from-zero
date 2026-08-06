package com.devtalles.exception.errorsimulation;

public class ErrorSimulation {
    static void main() {
        try {
            simulateError();
        } catch (Exception error) {
            System.out.println("Error detectado: " + error.getMessage());
            System.out.println("Detalles del error:");
            error.printStackTrace();
        }
    }

    public static void simulateError() {
        causeError();
    }

    private static void causeError() throws RuntimeException {
        throw new RuntimeException("Se ha producido un error critico");
    }
}

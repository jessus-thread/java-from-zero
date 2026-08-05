package com.devtalles.datastructure.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
    static void main(String[] args) {
        Map<String, Integer> productPrices = new HashMap<>();

        productPrices.put("laptop", 2000);
        productPrices.put("monitor", 3000);
        productPrices.put("movil", 5000);

        System.out.println(productPrices);

        // Obtener un valor mediante clave
        System.out.println(productPrices.get("laptop"));

        // Actualizar
        productPrices.put("laptop", 2300);

        System.out.println(productPrices);

        // Eliminar
        productPrices.remove("laptop");

        System.out.println(productPrices);
    }
}

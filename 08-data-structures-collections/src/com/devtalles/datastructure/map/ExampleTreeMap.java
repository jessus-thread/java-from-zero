package com.devtalles.datastructure.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {
    static void main() {
        // Ordena los elementos por clave
        Map<String, Integer> productPrices = new TreeMap<>();

        productPrices.put("laptop", 2000);
        productPrices.put("monitor", 3000);
        productPrices.put("movil", 5000);
        productPrices.put("mouse", 1200);
        productPrices.put("teclado", 900);
        productPrices.put("Angular", 30000);
        productPrices.put("zapatos", 900);

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

package com.devtalles.datastructure.map;

import java.util.Map;
import java.util.TreeMap;

public class Product implements Comparable<Product>{
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.id, o.id);
    }

    static void main() {
        /*
            Es buena idea usar como clave el objeto que en este caso es
            Product cuando necesitamos ordenar por mas de un criterio
         */
        Map<Product, Double> priceMap = new TreeMap<>();

        priceMap.put(new Product(123, "Laptop"), 1000.0);
        priceMap.put(new Product(2, "Movil"), 200.0);
        priceMap.put(new Product(22, "Mouse"), 300.0);
        priceMap.put(new Product(33, "Teclado"), 10330.0);

        System.out.println(priceMap);

        priceMap.remove(new Product(123, "Laptop"));

        System.out.println(priceMap);

        // Update
        priceMap.put(new Product(2, "Movil"), 1.00);

        System.out.println(priceMap);

        // Obtener valor
        System.out.println(priceMap.get(new Product(22, "Mouse")));
    }
}

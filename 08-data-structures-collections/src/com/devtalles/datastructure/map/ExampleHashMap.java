package com.devtalles.datastructure.map;

import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================================
 * DATA STRUCTURE: HashMap
 * ============================================================================
 * 
 * 1. WHAT IS THIS DATA STRUCTURE?
 * A HashMap is an implementation of Java's 'Map' interface. It stores 
 * information in "Key-Value" pairs. Unlike arrays, you do not access 
 * data via a numeric index (0, 1, 2), but rather through a unique "Key" 
 * that you define yourself.
 * 
 * 2. WHAT IS IT USED FOR?
 * It is the direct equivalent to objects {} in JavaScript/TypeScript or 
 * dictionaries in Python. It is used to create a catalog where you need 
 * to search for things almost instantaneously using an identifier. 
 * Example usage in backend development: Finding a user's complete data (Value) 
 * by providing solely their email address (Key).
 * 
 * 3. MAIN USEFUL METHODS:
 * - put(K, V): Inserts a new pair or updates the value if the key already exists.
 * - get(K): Returns the value associated with the key (or 'null' if it doesn't exist).
 * - remove(K): Removes the key and its value from the map.
 * - containsKey(K): Returns 'true' if the key exists (Super useful for validations).
 * - containsValue(V): Returns 'true' if any record has that value.
 * - keySet(): Returns a list (Set) containing all registered keys.
 * - values(): Returns a collection containing all registered values.
 * 
 * 4. STRENGTHS AND WEAKNESSES:
 * + [STRENGTH]: Extreme speed. Its read, write, and deletion operations 
 *   have an O(1) performance (Constant Time). That is, it takes 
 *   the exact same amount of time to find your data whether there are 10 or 
 *   10 million records.
 * - [WEAKNESS]: It does not maintain order. Data may be printed or traversed 
 *   in a different order than you inserted it. Additionally, it consumes slightly more 
 *   RAM than a traditional array.
 * 
 * 5. DETAILED INFORMATION (Under the hood):
 * Internally, a HashMap is an array of "buckets". When you make 
 * a put("laptop", 2000), Java takes the string "laptop", passes it through a 
 * mathematical function called a 'Hash function', and converts it into an integer index. 
 * If two different keys happen to generate the same mathematical index 
 * (known as a "Collision"), Java does not delete the data, but instead stores 
 * both in the same bucket using a Linked List. Starting 
 * from Java 8, if that collision list grows to more than 8 elements, it transforms 
 * automatically into a Binary Tree (Red-Black Tree) to ensure its 
 * speed never degrades.
 * ============================================================================
 */
public class ExampleHashMap {
    public static void main(String[] args) {
      /*
        DECLARATION: We use polymorphism. The general type (Map) on the 
        left, and the concrete implementation (HashMap) on the right.

        <String, Integer> indicates that the Keys will be text and the Values numbers.
    */
        Map<String, Integer> productPrices = new HashMap<>();

        // INSERT DATA -> Execution time: O(1)
        productPrices.put("laptop", 2000);
        productPrices.put("monitor", 3000);
        productPrices.put("movil", 5000);

        // Print the map. Note: Do not rely on the order shown in the console.
        System.out.println("Catálogo original: " + productPrices);

       /*
            READ A VALUE BY ITS KEY -> Execution time: O(1)
            Java goes directly to the exact "bucket" without traversing the other elements.
        */
        System.out.println("Precio de laptop: " + productPrices.get("laptop"));

        /*
            UPDATE A VALUE -> Execution time: O(1)
            Since keys must be unique, calling put() with an existing key
            simply overwrites the old value with the new one.
        */
        productPrices.put("laptop", 2300);

        System.out.println("Catálogo tras actualización: " + productPrices);

        // DELETE A RECORD -> Execution time: O(1)
        productPrices.remove("laptop");

        System.out.println("Catálogo tras eliminación: " + productPrices);
        
        
        // Checking for existence (containsKey) prevents errors such as NullPointerException.
        if (productPrices.containsKey("monitor")) {
            System.out.println("El monitor sí está registrado en la base de datos.");
        }
    }
}
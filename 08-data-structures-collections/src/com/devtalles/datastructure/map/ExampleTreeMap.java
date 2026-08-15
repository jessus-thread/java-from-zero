package com.devtalles.datastructure.map;

import java.util.Map;
import java.util.TreeMap;

/**
 * ============================================================================
 * DATA STRUCTURE: TreeMap
 * ============================================================================
 * 
 * 1. WHAT IS THIS DATA STRUCTURE?
 * It is another implementation of the 'Map' interface to store Key-Value pairs. 
 * However, its standout feature and fundamental difference is that it 
 * automatically KEEPS KEYS SORTED at all times.
 * 
 * 2. WHAT IS IT USED FOR?
 * It is useful for scenarios where you need a dictionary, but ORDER is 
 * non-negotiable. For example: 
 * - Printing a user report sorted alphabetically by their last name.
 * - Displaying a player ranking (leaderboard) sorted by score.
 * - Making range queries ("bring me all products from A to C").
 * 
 * 3. MAIN USEFUL METHODS:
 * - The basic Map methods: put(K, V), get(K), remove(K), containsKey(K).
 * - And exclusive navigation methods:
 *   * firstKey(): Returns the lowest key (the first one).
 *   * lastKey(): Returns the highest key (the last one).
 *   * headMap(K): Returns a sub-map with all elements less than key K.
 *   * tailMap(K): Returns a sub-map with all elements greater than key K.
 * 
 * 4. STRENGTHS AND WEAKNESSES:
 * + [STRENGTH]: Perpetual sorting and range queries.
 * - [WEAKNESS]: It is slower than HashMap. Its operations (insert, search, 
 *   delete) have a performance of $O(\log n)$ (Logarithmic Time). This 
 *   means it requires making "jumps" and comparisons to find 
 *   the data. Additionally, it consumes more RAM because each element stores 
 *   references to other elements.
 * 
 * 5. DETAILED INFORMATION (Under the hood):
 * Internally, a TreeMap does NOT use an array of "buckets". It uses a 
 * complex mathematical structure called a "Red-Black Tree", 
 * which is a self-balancing Binary Search Tree.
 * Whenever you make a put(), the tree compares the new key with the root, 
 * decides whether it should go to the left branch (if smaller) or right (if larger), 
 * and restructures itself to avoid becoming unbalanced.
 * 
 * ORDER FUN FACT: By default, it sorts Strings based on the 
 * ASCII table (lexicographical order). Therefore, UPPERCASE letters 
 * have higher priority (lower numeric value) than lowercase ones.
 * ============================================================================
 */
public class ExampleTreeMap {
    // Note: I added `String[] args` to `main` so the code would compile.
    public static void main(String[] args) {
        
        // DECLARATION: We use Map on the left, but TreeMap on the right.
        Map<String, Integer> productPrices = new TreeMap<>();

        /*
            INSERT DATA -> Execution time: $O(\log n)$
            The computer must traverse the tree and compare strings to know 
            which branch to place each of these elements in.
        */
        productPrices.put("laptop", 2000);
        productPrices.put("monitor", 3000);
        productPrices.put("movil", 5000);
        productPrices.put("mouse", 1200);
        productPrices.put("teclado", 900);
        
        /*
            "Angular" starts with an uppercase letter. In the ASCII table, 'A' is 65 and 
            the 'l' in laptop is 108. Therefore, "Angular" will come first.
        */
        productPrices.put("Angular", 30000);
        productPrices.put("zapatos", 900);

        /*
            Print the map. You will notice that it is perfectly sorted 
            alphabetically (Uppercase first, then lowercase from a to z).
        */
        System.out.println("Catálogo original ORDENADO: " + productPrices);

        /*
            READ A VALUE BY ITS KEY -> Execution time: $O(\log n)$
            It is no longer a direct memory access. The algorithm has to 
            navigate through the branches of the tree until it finds "laptop".
        */
        System.out.println("Precio de laptop: " + productPrices.get("laptop"));

        // UPDATE A VALUE -> Execution time: $O(\log n)$
        productPrices.put("laptop", 2300);

        System.out.println("Catálogo tras actualización: " + productPrices);

        /*
            DELETE A RECORD -> Execution time: $O(\log n)$
            The tree must delete the node and reconnect the orphan branches
            to maintain perfect balance.
        */
        productPrices.remove("laptop");

        System.out.println("Catálogo tras eliminación: " + productPrices);
    }
}
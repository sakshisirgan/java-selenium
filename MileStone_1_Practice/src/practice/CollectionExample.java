package practice;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {

        // Q1: Convert a collection to an array
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("Original List: " + fruits);
        
     // Shuffle elements
        Collections.shuffle(fruits);
        System.out.println("Shuffled List: " + fruits);

        String[] fruitArray = fruits.toArray(new String[0]);
        System.out.println("Array elements: " + Arrays.toString(fruitArray));

        // Q2: Find a sublist in a List
        List<String> subList = fruits.subList(0, 2); // index 0 (inclusive) to 2 (exclusive)
        System.out.println("Sublist (0 to 2): " + subList);

        // Q3: Iterate through elements of a HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Custard Apple");

        System.out.println("\nIterating HashMap using entrySet:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("\nIterating HashMap using keySet:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        System.out.println("\nIterating HashMap using values:");
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }
    }
}


// Java program to sort hashmap by values
import com.sun.jdi.Value;

import java.util.*;
import java.lang.*;

public class MapWithString {
    public static void main(String[] args) {
        Map<String,Integer> hashmap = new HashMap<>();
        hashmap.put("Realme",17400);
        hashmap.put("oneplus",21000);
        hashmap.put("apple",120000);
        hashmap.put("sony",24666);
        hashmap.put("redmi",100000);
        // using for each Loop For Sorting
        // Before Sorting
        System.out.println("Original Array Before Sorting ");
        hashmap.forEach((key,value)->System.out.println(key + " -> " + value));
       // After Sorting Their Price
        System.out.println("\nAfter Sorting Original Prices Is :");
        // Creating A List for Original HashMap For Sort Order
        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashmap.entrySet());

        //Using Entry's comparingByValue() method for sorting in ascending order
        list.sort(Map.Entry.comparingByValue());
        //Printing the elements from the list
        list.forEach((fruit)->System.out.println(fruit.getKey() + " -> " + fruit.getValue()));
    }
    }




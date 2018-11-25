/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMAp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author root
 */
public class Example {

    public static void main(String[] args) {
        /* This is how to declare HashMap */
        HashMap<Integer, String> hmap = new HashMap<>();

        /*Adding elements to HashMap*/
        // un ordered
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");

        System.out.println(hmap);

        System.out.println("=========== Way(1) to get Items of map by Using For Iterator ======================");

        /* Display content using Iterator*/
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.print("key is: " + mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }

        /* Get values based on key*/
        String var = hmap.get(2);
        System.out.println("Value at index 2 is: " + var);

        /* Remove values based on key*/
        hmap.remove(3);

        System.out.println("=========== Way(2) to get Items of map by Using For Iterator ======================");

        System.out.println("Map key and values after removal:");
        Set<Integer> set2 = hmap.keySet();

        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            int Key = (int) iterator2.next();
            System.out.print("Key is: " + Key + " & Value is: " + hmap.get(Key));
        }

        System.out.println("\n=========== Way(3) to get Items of map by Using For each ======================");

        for (Integer Key : set2) {

            System.out.print("Key is: " + Key + " & Value is: " + hmap.get(Key));
        }
    }
}

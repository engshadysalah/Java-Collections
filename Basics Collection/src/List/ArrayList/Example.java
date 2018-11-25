/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author root
 */
public class Example {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        
        String s = new String("Shady");

        names.add("Shady");
        names.add(1, "Mohamed");
        names.add("Ahmed");
        names.add("Bassem");
        names.add("Galal");
        names.add("Adam");
   
        // Collections.sort(names);
        //  names.remove(1);
        //  names.set(0, "Engineer"); // edit
        System.out.println(names);

        System.out.println(names.contains(s));

        System.out.println(names.indexOf("Ahmed"));

        System.out.println(names.lastIndexOf("Ahmed"));

        System.out.println(names.subList(0, 2));

        System.out.println("=========== Way(1) to get Items of ArrayList by Using For Loop =============================");

        for (int i = 0; i < names.size(); i++) {

            String name = names.get(i);
            System.out.println(name);
        }

        System.out.println("=========== Way(2) to get Items of ArrayList by Using Foreach Loop =============================");

        for (String name : names) {

            System.out.println(name);
        }
       
        
        System.out.println("=========== Way(3) to get Items of ArrayList by Using Foreach in Java 7 ===========================");

        names.forEach(System.out::println);
                

        System.out.println("=========== Way(4) to get Items of ArrayList by Using For ListIterator ======================");

        for (ListIterator<String> iterator = names.listIterator(2); iterator.hasNext();) {

            String next = iterator.next();

            if (next.equals("Bassem")) {
                iterator.remove();
            } else {
                System.out.println(next);
             }

        }

        System.out.println("=========== Way(5) to get Items of ArrayList by Using For ListIterator =======================");

        ListIterator<String> li = names.listIterator(names.size());

        while (li.hasPrevious()) {

            System.out.println(li.previous());
        }

        System.out.println("======== convert ArrayList to Array ==========================================================");

        String[] arr = new String[names.size()];

        names.toArray(arr); // convert list arr
        
        Arrays.asList(arr); // convert arr to list

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }

        System.out.println("===============================================================================================");

    }
}

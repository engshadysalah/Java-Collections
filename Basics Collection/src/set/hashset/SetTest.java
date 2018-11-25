/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author root
 */
public class SetTest {

    public static void main(String[] args) {

        Set s = new HashSet();
        s.add("Shady");
        s.add("x");
        s.add(4);
        s.add(true);
        s.add(70.12);
        s.add("Shady");
        s.add(null);
        s.add(null);

//        // remove dublicate && not ordered
        System.out.println(s);
//        for (Iterator iterator = s.iterator(); iterator.hasNext();) {
//            Object next = (String) iterator.next();
////            if (next == 4) {
////                s.remove(next);
////            }
//
//        }
//        System.out.println(s);
////        
//
//        Set penSet = new HashSet();
//        penSet.add(new Pen("Shady", 70.3));
//        penSet.add(new Pen("Shady", 70.3));
//        penSet.add(new Pen("Basem", 80.3));
//        penSet.add(new Pen("Basem", 100.3));
//
//      

        // dosen't remove dublicate 
        //but to remove dublicate u muset override => equals and hashCode in Pen
//         System.out.println(penSet);
    }
}

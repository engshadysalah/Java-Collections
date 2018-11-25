/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set.treeset;

import java.util.TreeSet;

/**
 *
 * @author root
 */
public class TreeSetExample2 {

    public static void main(String[] args) {

        TreeSet<String> tree = new TreeSet<String>();
        tree.add("Dog");
        tree.add("Lion");
        tree.add("Elephant");
        tree.add("CAt");
        tree.add("Tiger");

        System.out.println("Tree : " + tree);

        System.out.println("TreeHeadSet : " + tree.headSet("Elephant"));

        System.out.println("TreeTailSet : " + tree.tailSet("Elephant"));

        System.out.println("TreeSubSet : " + tree.subSet("Dog", "Tiger"));

    }
}

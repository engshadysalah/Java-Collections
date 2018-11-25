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
public class TreeSetExample1 {

    public static void main(String[] args) {

        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(20);
        tree.add(10);
        tree.add(30);
        tree.add(50);
        tree.add(30);

        // remove dublicate && ordered
        System.out.println("Trees" + tree);

        System.out.println("First : " + tree.first());

        System.out.println("Last : " + tree.last());

        System.out.println("Remove First : " + tree.pollFirst());

        System.out.println("Remove Last : " + tree.pollLast());

        System.out.println("Trees" + tree);

        tree.add(28);

        System.out.println("Trees" + tree);

        // to get reverse tree
        TreeSet<Integer> revarseTree = new TreeSet<>(tree.descendingSet());
        System.out.println("RevarseTree : " + revarseTree);

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comperator;

import Comperable.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author root
 */
public class ArrayTest {

    public ArrayTest() {

        Customer[] cus = new Customer[4];

        cus[0] = new Customer("Shady", 22);
        cus[1] = new Customer("Mohamed", 11);
        cus[2] = new Customer("Beso", 30);
        cus[3] = new Customer("Amed", 25);

        Arrays.sort(cus, new AgeAscComp());

        for (int i = 0; i < cus.length; i++) {

            Customer cu = cus[i];
            System.out.println(cus[i]);
        }

    }

    public static void main(String[] args) {
        new ArrayTest();
    }

    class AgeAscComp implements Comparator<Customer> {

        @Override
        public int compare(Customer o1, Customer o2) {

            return o1.getAge() - o2.getAge();
        }

    }

    class AgeDescComp implements Comparator<Customer> {

        @Override
        public int compare(Customer o1, Customer o2) {

            return o2.getAge() - o1.getAge();
        }

    }

    class NameAscComp implements Comparator<Customer> {

        @Override
        public int compare(Customer o1, Customer o2) {

            return o1.getName().compareTo(o2.getName());
        }

    }

    class NameDescComp implements Comparator<Customer> {

        @Override
        public int compare(Customer o1, Customer o2) {

            return o2.getName().compareTo(o1.getName());
        }

    }

}

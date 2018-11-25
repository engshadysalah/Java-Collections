/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comperable;

import java.util.Arrays;

/**
 *
 * @author root
 */
public class ArrayTest {

    public static void main(String[] args) {

        CustomerTyp1[] cus = new CustomerTyp1[4];

        cus[0] = new CustomerTyp1("Shady", 22);
        cus[1] = new CustomerTyp1("Mohamed", 11);
        cus[2] = new CustomerTyp1("Beso", 30);
        cus[3] = new CustomerTyp1("Amed", 25);

        for (int i = 0; i < cus.length; i++) {

         //   CustomerTyp1 cu = cus[i];
            System.out.println(cus[i]);
        }

        System.out.println("==========================================");
        
        //sort based on age
        Arrays.sort(cus);

        for (int i = 0; i < cus.length; i++) {

            CustomerTyp1 cu = cus[i];
            System.out.println(cus[i]);
        }
        
        

    }
}

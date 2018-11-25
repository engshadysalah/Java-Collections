/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comperable;

/**
 *
 * @author root
 */
public class CustomerTyp1 implements Comparable {

    private String name;
    private int age;

    public CustomerTyp1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

        return name + " : " + age;
    }
//
//    // based on age (Asending)
//    @Override
//    public int compareTo(Object arg) {
//
//        int meAge = ((CustomerTyp1) this).getAge();
//        int argAge = ((CustomerTyp1) arg).getAge();
//
//        return meAge-argAge;
//    }

     // based on age (Desending)
    @Override
    public int compareTo(Object arg) {

        int meAge = ((CustomerTyp1) this).getAge();
        int argAge = ((CustomerTyp1) arg).getAge();

        return argAge - meAge;
    }
}

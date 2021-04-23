/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

/**
 *
 * @author quach
 */
public class DemoEncapsulation {

    public static void main(String[] args) {

        People p = new People("", 0);
        p.setAge(22);
        p.setName("Quach Hong Thu");

        System.out.println("Ten: " + p.getName());
        System.out.println("Tuoi: " + p.getAge());
    }

}

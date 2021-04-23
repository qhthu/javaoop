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
class People {

    private String name;
    private int age;

    public People(String name, int age) {
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

}

public class DemoEncapsulation {

    public static void main(String[] args) {

        People p = new People("", 0);
        p.setAge(22);
        p.setName("Quach Hong Thu");

        System.out.println("Ten: " + p.getName());
        System.out.println("Tuoi: " + p.getAge());
    }

}

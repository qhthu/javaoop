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
class Summary {

    private int numA;
    private int numB;
    private int numC;

    public Summary(int numA, int numB, int numC) {
        this.numA = numA;
        this.numB = numB;
        this.numC = numC;
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public int getNumC() {
        return numC;
    }

    public void setNumC(int numC) {
        this.numC = numC;
    }

    public int sum(int numA, int numB) {
        return numA + numB;
    }

    public int sum(int numA, int numB, int numC) {
        return numA + numB + numC;
    }

}

public class DemoPolymorphism {

    public static void main(String[] args) {
        Summary s = new Summary(0, 0, 0);

        System.out.println("Tong cua 2 so: " + s.sum(20, 33));
        System.out.println("Tong cua 3 so: " + s.sum(20, 33, 55));

    }

}

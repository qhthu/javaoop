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
abstract class Abs {

    public abstract int sum(int numA, int numB);
}

interface Inter {

    public abstract int sum(int numA, int numB);
}

class AbsInterface implements Inter {

    @Override
    public int sum(int numA, int numB) {
        return numA + numB;
    }

}

public class DemoAbstraction extends Abs {

    @Override
    public int sum(int numA, int numB) {
        return numA + numB;
    }

    public static void main(String[] args) {
        Abs demo = new DemoAbstraction();
        System.out.println(demo.sum(10, 20));

        AbsInterface absi = new AbsInterface();

        System.out.println(absi.sum(100, 20));

    }

}

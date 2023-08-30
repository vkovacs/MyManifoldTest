package org.example;

public class Main {

    //http://manifold.systems/
    public static void main(String[] args) {
        var aDouble = Double.valueOf(1.2d);

        System.out.println(aDouble.asJsonString());

        MyStringContainer c0 = new MyStringContainer("abc");
        MyStringContainer c1 = new MyStringContainer("cb");

        System.out.println(c0 + c1);
    }
}
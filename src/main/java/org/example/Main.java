package org.example;

public class Main {

    //http://manifold.systems/
    public static void main(String[] args) {
        var aDouble = Double.valueOf(1.2d);

        System.out.println(aDouble.asJsonString());

        System.out.println(new MyStringContainer("abc") + new MyStringContainer("cb"));
    }
}
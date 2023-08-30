package org.example;

public class Main {
    public static void main(String[] args) {
        var aDouble = Double.valueOf(1.2d);

        System.out.println(aDouble.asJsonString());
    }
}
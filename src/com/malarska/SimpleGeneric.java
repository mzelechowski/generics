package com.malarska;

public class SimpleGeneric {
    public static void main(String[] args) {
        Point<Integer> integerPoint = new Point<>(12,30);
        System.out.println(integerPoint.toString());

        Point<String> stringPoint = new Point<>("X","Y");
        System.out.println(stringPoint.toString());

        Trio<String, Integer, String> trio = new Trio<>("Adam", 10, "Kasia");
        System.out.println(trio);
    }

}

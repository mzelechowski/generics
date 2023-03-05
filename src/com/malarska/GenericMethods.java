package com.malarska;

import java.util.ArrayList;

public class GenericMethods {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(50);
        arr.add(100);
        System.out.println(Util.getLastElement(arr));
    }
}

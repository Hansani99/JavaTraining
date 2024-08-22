package com.javatutorial;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        System.out.println(arrayList.size());
        arrayList.remove(3);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
    }
}

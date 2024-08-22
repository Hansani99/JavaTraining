package com.javatutorial;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetExamples {

    public static void main(String[] args) {

        List<String> values = new ArrayList<>();

        values.add("java");
        values.add("python");
        values.add("c++");
        values.add("selenium");
        values.add("java");

        HashSet<String> removeDuplicates = new HashSet<>();
        removeDuplicates.addAll(values);

        for(String s: removeDuplicates){
            System.out.println(s);

        }


    }
}

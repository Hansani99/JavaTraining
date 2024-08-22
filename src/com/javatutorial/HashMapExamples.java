package com.javatutorial;

import java.util.HashMap;

public class HashMapExamples {

    public static void main(String[] args) {

        HashMap<Integer,String> languages = new HashMap<>();

        languages.put(1,"Java");
        languages.put(2,"c++");
        languages.put(3,"selenium");
        languages.put(4,"python");
        languages.put(5,"web");

        System.out.println(languages);

        if(languages.containsKey(2)){
            System.out.println(languages.get(2));

        }

        if(languages.isEmpty()){
            System.out.println("Hashmap contains mapping");
        }

        languages.remove(3);
        System.out.println(languages);
    }

}

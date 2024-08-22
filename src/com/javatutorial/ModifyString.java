package com.javatutorial;

public class ModifyString {

    public static void main(String[] args) {

        String s1 = "Learning Java";
        String s2 = "Basics";

        System.out.println("length is :" + s1.length());
        System.out.println("get lower case :" + s1.toLowerCase());
        System.out.println("get upper case :" + s1.toUpperCase());
        System.out.println("get char :" + s1.indexOf("j"));
        System.out.println("get char :" + s1.charAt(5));
    }
}

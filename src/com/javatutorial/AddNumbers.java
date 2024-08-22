package com.javatutorial;

public class AddNumbers {

    public static void main(String[] args) {

        addNumbers(3,4);
        addNumbers(8,4);
        addNumbers(9,12);

        int result = addNumbers(3,7);
        int output = result +5;
        System.out.println("increment the output"+ output);
    }

    public static int addNumbers(int num1, int num2) {

        int res= num1+ num2;
        System.out.println("Your result is;" +res);
        return res;
    }
}

package com.javatutorial;

public class Hyundai extends Car{

    public static void main(String[] args) {

        start();
        accelerate();
    }
    public static void breaks(){
        System.out.println("Press the breaks");
    }

    public static void start(){

        String key ="On";
        System.out.println("turn the key"+ key);
    }

}

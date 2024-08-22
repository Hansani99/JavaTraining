package com.javatutorial;

public class Audi {

    public static void main(String[] args) {
        Car audi = new Car();
        audi.setSize(56);
        audi.setWeight(23.87);
        audi.setColor("yellow");
        audi.displayCar();

        Car.accelerate();
        Car.start();

        displayLogo ("A");
        displayLogo(100);

    }

    public static void displayLogo(String s1){
        System.out.println("logo is:"+s1);
    }

    public static void displayLogo(int s){
        System.out.println("logo is" +s);
    }
}

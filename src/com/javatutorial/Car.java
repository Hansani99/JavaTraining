package com.javatutorial;

public class Car {

    private int size;
    private double weight;
    private String color;

    public static void start() {
        System.out.println("Press the start key");
    }

    public static void accelerate() {
        System.out.println("Press the accelerate");
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayCar() {

        System.out.println("Color of the car is:" +color);
        System.out.println("weight of the car is:" +weight);
        System.out.println("size of the car is :" +size);
    }

}




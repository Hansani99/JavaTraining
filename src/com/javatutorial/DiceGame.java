package com.javatutorial;

import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();

        if (number<=6){
            System.out.println("You won the game");
        }else{
            System.out.println("You lost the game");
        }
    }
}

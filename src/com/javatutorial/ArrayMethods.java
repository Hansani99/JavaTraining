package com.javatutorial;

import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {

        int arr[] ={2,3,4,5,6};
        int arr2[]={3,8,2,4,1,};
        Arrays.sort(arr);
        System.out.println("Length of array: " +arr.length);
        System.out.println("Sorted array" + Arrays.toString(arr));

        if(arr.equals(arr2)){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }
    }
}

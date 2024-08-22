package com.javatutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFiles {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("D:/test.txt");
            int c = fis.read();
            System.out.println((char) c);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.learn.avnash.execption.example.demo.multiTryCatch;
import java.io.*;

public class MultiTryCatch {
    public static void main(String[] args) {
        
        try (FileInputStream is = 
                new FileInputStream("file_path/file.txt")){
            
            // Perform reading and writing file here
            int a = 0;
            int b = 10;
            int c = b / a;
            System.out.println("c = " + c);
        } catch (IOException | ArithmeticException e) {
            e.printStackTrace();
        } 
    }

}

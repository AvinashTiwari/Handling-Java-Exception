package com.learn.avnash.execption.example.demo.throwexample;
import java.io.*;

public class Throwexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            handleException();
	        } catch (FileNotFoundException fe) {
	            System.out.println("File not found exception");
	        } catch (ArithmeticException ae) {
	            System.out.println("Arithmetic exception");
	        } catch (Exception e) {
	            System.out.println("General exception");
	        }

	}
	   static void handleException() throws FileNotFoundException, ArithmeticException, Exception{
	        FileInputStream fis = new FileInputStream("file.txt");
	        int a = 0;
	        int b = 10;
	        if (a == 0) {
	            throw new ArithmeticException();
	        }
	        if (b < 1) {
	            throw new ArithmeticException("B must be greater than 1");
	        }

	        int c = b / a;
	        System.out.println("c = " + c);
	    }

}

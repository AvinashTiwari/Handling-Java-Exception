package com.learn.avnash.execption.example.demo.finallyBlock;

public class Finallyblock {
	 public static void main(String[] args) {
	        try {
	            int a = 0;
	            int b = 10;
	            int c = b / a;
	            System.out.println("c = " + c);
	        } catch (Exception e) {
	            System.out.println("Exception: " + e.getMessage());
	        } finally {
	            System.out.println("In finally");
	        }
	        
	        System.out.println("Other task in the program!");
	    }

}

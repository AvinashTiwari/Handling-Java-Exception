package com.learn.avnash.execption.example.demo.customexception;

import java.util.Scanner;


public class WriteCustomExceptionClass {
	 public static void main(String[] args) {
	        try {
	            usingMyOwnException();
	        } catch (MyMathCustomException ex) {
	            ex.showException();
	        }
	    }
	    
	    static void usingMyOwnException() throws MyMathCustomException{
	        int a, b;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a: ");
	        a = sc.nextInt();
	        System.out.print("Enter b: ");
	        b = sc.nextInt();
	        
	        if (a == 0) {
	            throw new MyMathCustomException(a, "Alert!! Dangerous value:");
	        }
	        
	        int c = b/a;
	        
	        System.out.println("c = " + c);
	    }
}

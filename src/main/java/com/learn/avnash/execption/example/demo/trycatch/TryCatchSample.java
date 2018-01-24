package com.learn.avnash.execption.example.demo.trycatch;

public class TryCatchSample {

	public static void main(String[] args) {
		 try {
	            int a = 0;
	            int b = 10;
	            int c = b / a;
	            System.out.println("c = " + c);
	        } catch (ArithmeticException ae) {
	            System.out.println(ae.getMessage());
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	        System.out.println("Other task in the program!");


	}

}

package com.learn.avnash.execption.example.demo.propgation;

public class ExceptionPropgation {
	 public static void main(String[] args) {
	        try {
	            f3();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    static void f3() {
	        f2();
	    }
	    static void f2() {
	        f1();
	    }
	    static void f1() {
	        f();
	    }
	    static void f() {
	        int a = 0;
	        int b = 10;
	        int c = b / a;
	        System.out.println("c = " + c);
	    }
}

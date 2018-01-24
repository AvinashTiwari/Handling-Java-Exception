package com.learn.avnash.execption.example.demo.assertsampe;

import java.util.Scanner;

public class assertExceptionSample {
	public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        a = sc.nextInt();
        System.out.print("Input b: ");
        b = sc.nextInt();
        
        assert a > 2 : "Invalid value";
        
        int c = b/a;
        
        System.out.println("c = " + c);
    }

}

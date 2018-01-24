package com.learn.avnash.execption.example.loggingbasicsample;
import java.util.Scanner;
import java.util.logging.*;

public class loggingbasic {
	private final static Logger LOGGER
    = Logger.getLogger(loggingbasic.class.getName());

public static void main(String[] args) {
try {
    int a, b;
    Scanner sc = new Scanner(System.in);
    System.out.print("Input a: ");
    a = sc.nextInt();
    System.out.print("Input b: ");
    b = sc.nextInt();

    if (a < 2) {
        LOGGER.log(Level.WARNING, "Too close to 0");
    } else {
        LOGGER.log(Level.INFO, "Data is safe");
    }

    int c = b / a;

    System.out.println("c = " + c);
} catch (Exception e) {
    LOGGER.log(Level.SEVERE, e.getMessage());
}

}

}

package com.learn.avnash.execption.example.custom.loggingFormatter;
import java.util.Scanner;
import java.util.logging.*;

public class CustomLogger {
	 private final static Logger LOGGER = 
	            Logger.getLogger(CustomLogger.class.getName());
	    public static void main(String[] args) {
	        FileHandler logFile = null;
	        try {
//	            logFile = new FileHandler("C:\\test\\log.txt");
	            logFile = new FileHandler("C:\\test\\log.html");
	            logFile.setFormatter(new CustomFormatter());
	            LOGGER.addHandler(logFile);
	            int a, b;
	            Scanner sc = new Scanner(System.in);
	            System.out.print("Input a: ");
	            a = sc.nextInt();
	            System.out.print("Input b: ");
	            b = sc.nextInt();
	   
	            if(a < 2) {
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

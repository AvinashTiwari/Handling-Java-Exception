package com.learn.avnash.execption.example.loggingFormatter;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class loggingFormatter {
	private final static Logger LOGGER = Logger.getLogger(loggingFormatter.class.getName());

	public static void main(String[] args) {
		FileHandler logFile = null;
		try {
			logFile = new FileHandler("C:\\test\\log.txt", true);
			logFile.setFormatter(new SimpleFormatter());
			LOGGER.addHandler(logFile);

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

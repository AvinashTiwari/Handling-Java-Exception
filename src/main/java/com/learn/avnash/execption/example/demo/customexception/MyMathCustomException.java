package com.learn.avnash.execption.example.demo.customexception;

public class MyMathCustomException extends Exception{
    private int value;
    private String message;

    public MyMathCustomException(int value, String message) {
        this.value = value;
        this.message = message;
    }
    public void showException() {
        System.out.println(message + " " + value);
    }
}

package com.mmx.unit1;

public class PrintAnyMessage {
    public PrintAnyMessage() {
        message = "Hello world!";
    }
    public PrintAnyMessage(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
    }

    private String message;
}

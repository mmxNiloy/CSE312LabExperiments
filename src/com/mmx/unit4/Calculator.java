package com.mmx.unit4;

public class Calculator {
    public Calculator() {}

    public Calculator(String numA, String numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public String getNumA() {
        return numA;
    }

    public void setNumA(String numA) {
        this.numA = numA;
    }

    public String getNumB() {
        return numB;
    }

    public void setNumB(String numB) {
        this.numB = numB;
    }

    public int sum(int a, int b) { return a + b; }
    public double sum(double a, double b) { return a + b; }
    public String sum(String numA, String numB) {
        return "" + (Double.parseDouble(numA) + Double.parseDouble(numB));
    }

    public void displaySum() {
        System.out.printf("%s + %s = %s\n", numA, numB, sum(numA, numB));
    }

    private String numA;
    private String numB;
}

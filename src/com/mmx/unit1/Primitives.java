package com.mmx.unit1;

public class Primitives {
    public Primitives() {}

    public void printDefaultValues() {
        System.out.printf(
            "%s has default value %b\n" +
            "%s has default value %d\n" +
            "%s has default value %d\n" +
            "%s has default value %s\n" +
            "%s has default value %d\n" +
            "%s has default value %.2f\n" +
            "%s has default value %d\n" +
            "%s has default value %.2f\n",
            "boolean", pBoolean,
            "byte", pByte,
            "short", pShort,
            "char", pChar,
            "int", pInt,
            "float", pFloat,
            "long", pLong,
            "double", pDouble
        );
    }

    // Primitive data types
    private boolean pBoolean;
    private byte pByte;
    private short pShort;
    private char pChar;
    private int pInt;
    private float pFloat;
    private long pLong;
    private double pDouble;
}

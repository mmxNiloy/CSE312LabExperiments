package com.mmx.unit2;

public class Quadratic {
    public static void printRootsFromCoefficents(int a, int b, int c) {
        int d = b * b - 4 * a * c;
        boolean isComplex = d < 0;
        d = Math.abs(d);
        System.out.printf("x1 = %f%s, x2 = %f%s\n",
            (Math.sqrt(d) - b) / (double)(2 * a),
            (isComplex ? "i" : ""),
            -((Math.sqrt(d) + b) / (double)(2 * a)),
            (isComplex ? "i" : "")
        );
    }
}

package com.mmx.unit2;

public class TriangleConstructionDemo {
    public static void printBinaryTriangle(int rows) {
        if(rows <= 0) return;
        System.out.println(1);
        for(int pow = 1 ; pow < Math.min(31, rows) ; pow++) {
            System.out.println(Integer.toBinaryString((1 << (2 * pow)) + 1));
        }
    }

    public static void printInvertedTriangle(int rows) {
        if(rows <= 0) return;

        for(int i = 0 ; i <= rows ; i++) {
            for(int j = rows - i ; j <= rows ; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }

    public static void printTriangle(int rows) {
        if(rows <= 0) return;

        for(int i = 1 ; i <= rows ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}

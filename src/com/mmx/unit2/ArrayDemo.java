package com.mmx.unit2;

import java.util.Arrays;

public class ArrayDemo {
    public static void demonstrateArrays() {
        // One dimensional arrays
        int[] odArray = {1, 2, 3, 4, 5};
        System.out.println("One Dimensional array\n\tA = " + Arrays.toString(odArray) + "\n\t|A| = " + odArray.length);

        // Two dimensional arrays
        System.out.println();
        int[][] tdArray = {odArray, odArray, odArray};
        System.out.println("Two Dimensional array");
        System.out.println("\tA = [");
        for (int[] nums : tdArray) {
            System.out.println("\t\t" + Arrays.toString(nums) + ",");
        }
        System.out.printf("\t]\n\t|A| = %d x %d", tdArray.length, tdArray[0].length);

        // Three-dimensional/Multi-dimensional arrays
        System.out.println();
        int[][][] thdArray = {tdArray, tdArray, tdArray, tdArray};
        System.out.println("\tA = [");
        for(int[][] td : thdArray) {
            System.out.println("\t\t[");
            for(int[] od : td) {
                // Code
                System.out.println("\t\t\t" + Arrays.toString(od) + ",");
            }
            System.out.println("\t\t],");
        }
        System.out.printf("\t]\n|A| = %d x %d x %d", thdArray.length, thdArray[0].length, thdArray[0][0].length);
    }
}

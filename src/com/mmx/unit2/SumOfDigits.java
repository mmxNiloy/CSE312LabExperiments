package com.mmx.unit2;

public class SumOfDigits {
    public static int sumOfDigits(int num) {
        int n = Math.abs(num);
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static int sumOfDigits(String numStr) {
        int sum = 0;
        for(int i = 0 ; i < numStr.length() ; i++) {
            if(Character.isDigit(numStr.charAt(i))) sum += Character.getNumericValue(numStr.charAt(i));
        }

        return sum;
    }
}

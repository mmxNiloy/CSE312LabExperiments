package com.mmx.unit2;

public class SumOfDigits {
    public static int sumOfDigits(int num) {
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num /= 10;
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

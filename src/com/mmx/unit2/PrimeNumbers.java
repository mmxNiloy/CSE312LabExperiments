package com.mmx.unit2;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    private List<Integer> primeNumbers;
    private boolean[] flags;

    public PrimeNumbers() {
        sieve();
    }

    private void sieve() {
        int maxNum = 2000000;
        flags = new boolean[maxNum];

        flags[0] = flags[1] = true;
        for(int i = 2 ; i * i < maxNum ; i++) {
            if(!flags[i]) {
                for(int j = i * 2 ; j < maxNum ; j += i) flags[j] = true;
            }
        }
    }

    public boolean isPrime(int number) {
        if(number > flags.length) {
            System.out.println("Cannot compute it at the moment!");
            return false;
        }

        return !flags[number];
    }
}

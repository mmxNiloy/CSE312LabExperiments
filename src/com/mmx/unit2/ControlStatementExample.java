package com.mmx.unit2;

public class ControlStatementExample {
    public static void showControlStatementExamples() {
        // If-else statement example
        int a = 10;
        int b = 5;
        if(a > b) {
            System.out.println("Executing from if block");
        } else {
            System.out.println("N\\A");
        }

        if(a < b) {
            System.out.println("N\\A");
        } else {
            System.out.println("Executing from the else block");
        }

        // Switch statement example
        System.out.println();
        switch (b) {
            case 5:
                System.out.println("Executing from cased switch statement");
                break;
            default:
                System.out.println("Executing from default switch statement");
                break;
        }

        // For loop example
        System.out.println();
        for(int i = 0 ; i < 5 ; i++) {
            System.out.println("This is a for loop example");
        }

        // While loop example
        System.out.println();
        a = 5;
        while(a > 0) {
            System.out.println("This is a while loop example");
            a--;
        }

        // Do-while loop example
        System.out.println();
        a = 5;
        do {
            System.out.println("This is a do-while loop example");
            a--;
        } while(a > 0);

    }
}

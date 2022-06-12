package com.mmx.unit2;

public class OperatorExample {
    public OperatorExample() {}

    public static void showOperatorExamples() {
        // Increment operators
        int a = 10;
        System.out.println("Increment Operators");
        System.out.printf("\t1. Post-increment:\n\tLet, a = %d, therefore a++ = %d\n", a, a++);
        System.out.printf("\tor, a was equal to %d and now, a = %d", a - 1, a);

        a = 10;
        System.out.printf("\t2. Pre-increment:\n\tLet, a = %d, therefore ++a = %d\n", a, ++a);
        System.out.println();

        // Decrement operators
        a = 10;
        System.out.println("Decrement Operators");
        System.out.printf("\t1. Post-decrement:\n\tLet, a = %d, therefore a-- = %d\n", a, a--);
        System.out.printf("\tor, a was equal to %d and now, a = %d", a + 1, a);

        a = 10;
        System.out.printf("\t2. Pre-decrement:\n\tLet, a = %d, therefore --a = %d\n", a, --a);
        System.out.println();

        // Bitwise complement operator
        a = 10;
        System.out.println("Bitwise complement operator");
        System.out.printf("\tLet, a = %s, therefore ~a = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(~a));

        // Arithmetic operators
        int b = 7;
        a = 17;

        System.out.println("Arithmetic Operators");
        System.out.printf("\t1. Addition (+):\n\tLet, a = %d, b = %d, so, a + b = %d\n", a, b, a + b);
        System.out.printf("\t2. Subtraction (-):\n\tLet, a = %d, b = %d, so, a - b = %d\n", a, b, a - b);
        System.out.printf("\t3. Multiplication (*):\n\tLet, a = %d, b = %d, so, a * b = %d\n", a, b, a * b);
        System.out.printf("\t4. Division (/):\n\tLet, a = %d, b = %d, so, a / b = %d\n", a, b, a / b);
        System.out.printf("\t5. Modulus (%%):\n\tLet, a = %d, b = %d, so, a %% b = %d\n", a, b, a % b);
        System.out.println();

        // Bitwise operators
        a = 41;
        b = 5;

        System.out.println("Bitwise Operators");
        System.out.printf("\t1. AND (&):\n\tLet, a = %d, b = %d, so, a & b = %d\n", a, b, a & b);
        System.out.printf("\t2. OR (|):\n\tLet, a = %d, b = %d, so, a | b = %d\n", a, b, a | b);
        System.out.printf("\t3. NOT (~):\n\tLet, a = %d, so, ~a = %d\n", a, ~a);
        System.out.printf("\t4. XOR (^):\n\tLet, a = %d, b = %d, so, a ^ b = %d\n", a, b, a ^ b);
        System.out.printf("\t5. Left Shift (<<):\n\tLet, a = %d, b = %d, so, a << b = %d\n", a, b, a << b);
        System.out.printf("\t5. Right Shift (>>):\n\tLet, a = %d, b = %d, so, a >> b = %d\n", a, b, a >> b);
        System.out.println();

        // Conditional operators
        a = 17;
        b = 23;

        System.out.println("Conditional Operator ( bool_expr ? return_true : return_false )");
        System.out.printf("\tLet, a = %d, b = %d, so, a > b ? 1 : 0 = %d\n", a, b, (a > b ? 1 : 0));
    }
}

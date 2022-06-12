package com.mmx.unit4;

import java.util.Scanner;

public class QnABot {
    public QnABot() {
        answer = "James Gosling";
        tries = 0;
        hints = new boolean[answer.length()];
        hints[5] = true;
    }

    public void run() {
        boolean flag = false;
        while(!flag) {
            ask();
            flag = receiveResponse();
        }
    }

    private void ask() {
        System.out.println("Who is the inventor of JAVA?");
    }

    private boolean receiveResponse() {
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();

        if(answer.equals(ans)) {
            System.out.println("Good");
            return true;
        } else {
            tries++;

            if(tries == 3) {
                System.out.println("Woops, wrong answer!");
                displayAnswer();
                return true;
            } else {
                System.out.println("Try Again!");
                displayHint();
            }
        }

        return false;
    }

    private void displayAnswer() {
        System.out.println("The answer is: " + answer);
    }

    private void displayHint() {
        System.out.print("Hint: ");
        int n = (int) Math.min(((Math.random() * 10) % 5) + 1, 3);
        for(int i = 0 ; i < n ; i++)
            hints[i] = true;

        if(tries == 2) {
            n = (int) Math.min(((Math.random() * 10) % 5) + 1, 3);
            for(int i = 0 ; i < n ; i++)
                hints[i + 6] = true;
        } else n = 0;

        for(int i = 0 ; i < answer.length() ; i++) {
            if(hints[i]) System.out.print(answer.charAt(i));
            else System.out.print('_');
        }
        System.out.println();
    }

    private String answer;
    private int tries;
    private boolean[] hints;
}

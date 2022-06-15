package com.mmx.unit4;

import java.util.Arrays;
import java.util.Scanner;

public class StringOpsTest {
    public static void askQuestion() {
        QnABot bot = new QnABot();
        bot.run();
    }

    public static String extractString(String str, int start, int end) {
        System.out.println("Extracted string: " + str.substring(start, end));
        return str.substring(start, end);
    }

    public static int readAndCount() {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String word = sc.nextLine();
        String[] words = text.split(" ");
        int count = 0;
        for(String wrd : words) count += (wrd.equals(word) ? 1 : 0);
        System.out.printf("%s occurs %d times in the text %s\n", word, count, text);
        return count;
    }

    public static String readAndSort() {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        var chrs = text.toCharArray();
        Arrays.sort(chrs);
        String ans = Arrays.toString(chrs);
        System.out.printf("%s in alphabetical order is %s\n", text, ans);
        return ans;
    }
}

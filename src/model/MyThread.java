package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyThread extends Thread {
    private String match;
    private String text;
    private int count;

    public MyThread() {
        match = "";
        text = "";
        count = 0;
    }

    @Override
    public void run() {
        // Count the articles.
        compute();
    }

    private void compute() {
        count = 0;
        String[] paragraphs = text.split("\n");
        List<String[]> sentences = new ArrayList<>();

        for (String para:
             paragraphs) {
            sentences.add(para.split("\\."));
        }

        List<String> words = new ArrayList<>();

        for (String[] sens:
             sentences) {
            for (String temp:
                 sens) {
                words.addAll(Arrays.asList(temp.split(" ")));
            }
        }

        for (String word:
             words) {
            if(match.equalsIgnoreCase(word)) count++;
        }
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCount() {
        return count;
    }
}

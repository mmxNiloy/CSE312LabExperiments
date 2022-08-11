package model;

public class MyThread extends Thread {
    private int count;
    private final String message;
    public MyThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        count = 1;
        for(int i = 0 ; i < message.length() ; i++) {
            if(message.charAt(i) == ' ') count++;
        }
    }

    public int getCount() {
        return count;
    }
}

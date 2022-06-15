package com.mmx.unit4;

public class Candidate {
    public Candidate() {
        name = "Unknown candidate";
        number = 0;
    }

    public Candidate(String name, int number) {
        setInformation(name, number);
    }

    public void setInformation(String name, int number) {
        this.name = name;
        this.number = number;
    }

    private String name;
    private int number;
}

package com.mmx.unit4;

import java.util.Scanner;

public class ElectionVoteCounter {
    public ElectionVoteCounter(Candidate[] candidates) {
        count = new int[6];
        this.candidates = candidates;
    }

    public ElectionVoteCounter() {
        count = new int[6];
        candidates = new Candidate[5];
        String[] names = {"Candidate A", "Candidate B", "Candidate C", "Candidate D", "Candidate E"};
        for(int i = 0 ; i < 5 ; i++) {
            candidates[i] = new Candidate(names[i], i + 1);
        }
    }

    public void countVotes() {
        int n;
        System.out.println("Enter the number of votes to count: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int x;
        for(int i = 0 ; i < n ; i++) {
            System.out.println("Enter your vote (1-5):\n");
            x = sc.nextInt();

            if(x < 1 || x > 5) count[0]++;
            else count[x]++;
        }
    }

    public void setCandidates(Candidate[] candidates) {
        this.candidates = candidates;
    }

    public void printResults() {
        System.out.println("Number\t\tCandidate\t\tReceived votes\n");
        for(int i = 1 ; i < 6 ; i++) {
            System.out.printf("%d.\t\t\t%s\t\t\t\t\t%d\n", i, candidates[i - 1], count[i]);
        }
        System.out.println("-\t\tSpoilt ballot\t\t\t" + count[0]);
    }

    private int[] count;
    private Candidate[] candidates;
}

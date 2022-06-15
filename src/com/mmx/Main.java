package com.mmx;

import com.mmx.unit1.Primitives;
import com.mmx.unit2.*;
import com.mmx.unit4.Candidate;
import com.mmx.unit4.ElectionVoteCounter;
import com.mmx.unit4.QnABot;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        /*TriangleConstructionDemo.printBinaryTriangle(5);
        System.out.println();
        TriangleConstructionDemo.printInvertedTriangle(5);
        System.out.println();
        TriangleConstructionDemo.printTriangle(5);*/

        /*PrimeNumbers pn = new PrimeNumbers();
        System.out.println(pn.isPrime(2));

        System.out.println(SumOfDigits.sumOfDigits("1234"));
        Quadratic.printRootsFromCoefficents(1, 4, 5);*/

        /*Matrix A = new Matrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        Matrix B = new Matrix(new int[][]{{9, 8, 7}, {6, 5, 4}, {3, 2, 1}});
        Matrix C = Matrix.multiply(A, B);
        C.printMatrix();*/

        /*String[] candidates = {"Liz", "Jay", "Ana", "Alto", "Derek"};
        ElectionVoteCounter evc = new ElectionVoteCounter();
        evc.setCandidates(candidates);
        evc.countVotes();
        evc.printResults();*/

        /*
        QnABot bot = new QnABot();
        bot.run();
        */

        String[] names = {"Candidate A", "Candidate B", "Candidate C", "Candidate D", "Candidate E"};
        Candidate[] candidates = new Candidate[5];
        for(int i = 0 ; i < 5 ; i++) {
            candidates[i] = new Candidate(names[i], i + 1);
        }

        ElectionVoteCounter evc = new ElectionVoteCounter();
        evc.setCandidates(candidates);
        evc.countVotes();
    }
}

/*
1 2 3       9 8 7
4 5 6       6 5 4
7 8 9       3 2 1

9+12+9 8 + 10 + 6
 */
package com.mmx.unit2;

public class Matrix {
    public Matrix() {}
    public Matrix(int n, int m) {
        mat = new int[n][m];
        rows = n;
        cols = m;
    }
    public Matrix(int[][] mat) {
        this.mat = mat;
        rows = mat.length;
        cols = mat[0].length;
    }

    public Matrix(Matrix A) {
        this.mat = A.mat;
        this.rows = A.getRows();
        this.cols = A.getCols();
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public void printMatrix() {
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < cols ; j++) {
                System.out.print(mat[i][j]+  " ");
            }
            System.out.println();
        }
    }

    public int getAt(int i, int j) { return mat[i][j]; }
    public void setAt(int i, int j, int val) { mat[i][j] = val; }

    public static Matrix add(Matrix A, Matrix B) {
        if(A.getRows() != B.getRows() || A.getCols() != B.getCols()) {
            System.out.println("Cannot add matrices of different ranks");
            return new Matrix();
        }

        Matrix res = new Matrix(A);
        for(int i = 0 ; i < B.getRows() ; i++) {
            for(int j = 0 ; j < B.getCols() ; j++) {
                res.setAt(i, j, B.getAt(i, j) + A.getAt(i, j));
            }
        }

        return res;
    }

    public static Matrix multiply(Matrix A, Matrix B) {
        if(A.getCols() == B.getRows()) {
            Matrix res = new Matrix(A.getRows(), B.getCols());

            for (int i = 0; i < A.getRows(); i++) {

                for(int j = 0 ; j < B.getCols() ; j++) {
                    int sum = 0;
                    for (int k = 0; k < A.getCols(); k++) {
                        sum += A.getAt(i, k) * B.getAt(k, j);
                    }
                    res.setAt(i, j, sum);
                }
            }
            return res;
        }

        System.out.println("Cannot multiply matrices of form (a x b), (c x d); where b is not equal to c");
        return new Matrix();
    }

    private int[][] mat;
    private int rows;
    private int cols;
}

package com.shreeji.patterns;

public class ques9 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    static void pattern(int n){
        for(int row = 1; row <= n; row++){
            for( int col = 1; col <= (2*n) - row; col++) {
                if (col >= row) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

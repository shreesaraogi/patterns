package com.shreeji.patterns;

public class ques6 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    static void pattern(int n){
        for(int row = n; row >= 1; row--){
            for( int col = 1; col <= n; col++) {
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

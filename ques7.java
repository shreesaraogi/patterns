package com.shreeji.patterns;

public class ques7 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    static void pattern(int n){
        for(int row = 1; row <= n; row++){
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

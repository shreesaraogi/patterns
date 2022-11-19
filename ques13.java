package com.shreeji.patterns;

public class ques13 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    static void pattern(int n){
        for(int row = 1; row<= n; row++){
            for(int spc = n;  spc> row; spc--){
                System.out.print(" ");
            }
            for(int col = 1; col<=(2*row-1); col++){
                if(col == 1 || row==n || col==(2*row-1)){
                    System.out.print("*");
                }
                 else System.out.print(" "); }
            System.out.println();
        }}
    }

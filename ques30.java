package com.shreeji.patterns;

public class ques30 {
    public static void main(String[] args) {
        int n = 5;

        pattern(n);
    }

    static void pattern(int n){
        for(int row= 1; row<=n; row++){
            for(int col = n; col>=1; col--){
                if(col<=row){
                    System.out.print(col);
                }
                else System.out.print(" ");
            }
            for(int col=2; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
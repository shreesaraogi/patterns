package com.shreeji.patterns;

public class ques25 {
    public static void main(String[] args) {
        int n = 5;
        pattern(5);
    }

    static void pattern(int n){
        for(int i=n; i>=1; i--){
            for(int spc=i; spc>1; spc--){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if(j==1||j==n||i==n||i==1){
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}

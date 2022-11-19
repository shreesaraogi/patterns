package com.shreeji.patterns;

public class ques19 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
    static void pattern(int n){

    for(int row = n; row>=1; row--){
        for(int col = n; col >=row; col--){
            System.out.print("*");
        }
        for(int spc= 1; spc< (2*row-1); spc++){
            System.out.print(" ");
        }
        for(int col = n; col >=row; col--){
            System.out.print("*");
        }
        System.out.println();
    }
        for(int row = 2; row<=n; row++){
            for(int col = n; col >=row; col--){
                System.out.print("*");
            }
            for(int spc= 1; spc< (2*row-1); spc++){
                System.out.print(" ");
            }
            for(int col = n; col >=row; col--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
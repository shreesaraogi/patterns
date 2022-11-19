package com.shreeji.patterns;

public class ques12 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    static void pattern(int n){
        for(int row = n; row >= 1; row--){
            for( int spc = n; spc> row;  spc--) {

                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }



            System.out.println();
        }

        for(int row = 2; row <= n; row++){
            for( int spc = n; spc> row;  spc--) {

                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }



            System.out.println();
        }




    }


    }

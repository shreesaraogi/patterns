package com.shreeji.patterns;

public class ques24 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
    static void pattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                if (j == i || j == n ) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            for(int spc=1; spc<(2*i-1); spc++){
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                if (j == i || j== n) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 2; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                if (j == i || j == n ) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            for(int spc=1; spc<(2*i-1); spc++){
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                if (j == i || j== n) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}

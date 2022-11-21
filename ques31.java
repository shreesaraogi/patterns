package com.shreeji.patterns;

public class ques31 {
    public static void main(String[] args) {
        int n =4;
        pattern(n);
    }

    static void pattern(int n) {
        n = 2*n;
        for(int i=1; i<=n-1; i++){
            for(int j=1; j<=n-1; j++){
                System.out.print((Math.max(Math.max(i, j), Math.max(n-i, n-j))-3)+" ");
            }
            System.out.println();
        }
    }
}

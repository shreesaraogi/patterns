package com.shreeji.patterns;

public class ques35 {
    public static void main(String[] args) {
        int n = 4;
        pattern(n);
    }

    static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int spc=2*n-i; spc>i; spc--){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println(); }
    }
}

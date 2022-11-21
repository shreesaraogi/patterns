package com.shreeji.patterns;

public class ques26 {
    public static void main(String[] args) {
        int n =6;
        pattern(n);
    }

    static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j = n; j>=i; j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

//pascal's triangle
package com.shreeji.patterns;

public class ques16 {
    public static void main(String[] args) {
        int n =4;
        pattern(n);
    }

    static void pattern(int n) {
        for(int i=0; i<n; i++){
            for(int spc=n; spc>i; spc--){
                System.out.print(" ");
            }
            int number = 1; //for every iteration set number as 1
            for(int j=0; j<=i; j++){
                System.out.print(number+" ");
                number = number * (i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
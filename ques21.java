package com.shreeji.patterns;

public class ques21 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
    static void pattern(int n){
        int count=1;
        for(int row= 1; row<=n; row++){
            for(int col= 1; col<= row; col++){
                System.out.print(count+"  ");
                count++;
            }


            System.out.println();
            if(count==11){
                break;
            }
        }
        for(int row= 5; row<=n; row++){
            for(int col= 1; col<= row; col++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}

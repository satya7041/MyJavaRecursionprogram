package com.company.Recursion;

public class Recursionprint1to5 {
    public static void printnumb(int n){
        if (n==7){
            return;
        }
        System.out.println(n);
        printnumb(n+1);
    }
    public static void main(String args[]){
        int n=1;
        printnumb(n);//n=1
    }
}

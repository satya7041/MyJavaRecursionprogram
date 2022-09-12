package com.company.Recursion;

public class Recursionprint5to1 {
    public static void  printnumb(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printnumb(n-1);
    }
    public static void main(String args[]){
        int n=5;
        printnumb(n);//n=5
    }
}

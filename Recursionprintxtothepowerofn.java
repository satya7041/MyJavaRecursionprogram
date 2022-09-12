package com.company.Recursion;

public class Recursionprintxtothepowerofn {
    public static  int Calcpower(int x,int n){
        if(n==0){ //this is a based case-1
            return 1;
        }
        if(x==0) { //base case-2
            return 0;
        }
        //if n is even
        if(n%2==0) {
            return Calcpower(x, n / 2) * Calcpower(x, n / 2);
        }
        else { // if n is odd
            return Calcpower(x, n / 2) * Calcpower(x, n / 2) * x;
        }
        }
        public static void main(String args[]){
        int x=2,n=5;
        int ans=Calcpower(x,n);
            System.out.println(ans);
    }
}

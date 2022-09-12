package com.company.Recursion;

public class RecursionTowerofHanoi {
    public static void TowerofHanoi(int n,String src,String helper,String dest){
     if(n==0){
         System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
         return;
     }
     TowerofHanoi(n-1,src,dest,helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        TowerofHanoi(n-1, helper, src, dest);
    }
    public static void main (String args[]){
        int n=3;
        TowerofHanoi(n,"S","H","D");
        //In Output don't follow disk 0 step because, I can't understand
    }
}

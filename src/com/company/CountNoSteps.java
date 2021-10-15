package com.company;

public class CountNoSteps {
    public static void main(String[] args) {
        System.out.println(CountNumbStep(41));
    }

     static  int CountNumbStep(int n) {
        return Helper(n,0);
    }

     static int Helper(int n, int step) {
        if (n==0){
            return step;
        }if (n%2==0){
            return Helper(n/2,step+1);
         }
        return Helper(n-1,step+1);
    }
}

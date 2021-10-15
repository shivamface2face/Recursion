package com.company;

public class CountNoZeroes {
    public static void main(String[] args) {
        System.out.println(CountZeroes(30214009));
    }

          static int CountZeroes(int n) {
        return Healper(n,0);
    }

     static int Healper(int n, int c) {
        if (n==0){
            return c;
        }
        int rem=n%10;
        if (rem==0){
            return Healper(n/10,c+1);
        }
        return Healper(n/10,c);
    }
}

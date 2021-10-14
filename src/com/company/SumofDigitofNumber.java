package com.company;

public class SumofDigitofNumber {
    public static void main(String[] args) {
        int ans=sumofDigitofNumber(134);
        System.out.println(ans);
    }

     static int sumofDigitofNumber(int n) {
        if (n==0){
            return 0;
        }
        return n%10+sumofDigitofNumber(n/10);
    }
}

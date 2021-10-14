package com.company;

public class ProductofDigit {
    public static void main(String[] args) {
        int ans=productofDigit(1235);
        System.out.println(ans);
    }

       static int productofDigit(int n) {
        if (n%10==n){
            return n;
        }
        return n%10*productofDigit(n/10);
    }
}

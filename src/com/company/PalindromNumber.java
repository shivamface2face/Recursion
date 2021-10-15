package com.company;

public class PalindromNumber {

    public static void main(String[] args) {

        System.out.println(IsPallindrome(12321));
    }

   static boolean IsPallindrome(int n) {
        return n ==ReverseNo2(n);
    }

    static int ReverseNo2(int n) {

        int digit=(int)(Math.log10(n)+1);

        return Healper(n,digit);



    }

    static int Healper(int n, int digit) {

        if (n%10==n){
            return n;
        }
        int rem=n%10;
        return rem* (int) Math.pow(10,digit-1)+Healper(n/10,digit-1);
    }



}

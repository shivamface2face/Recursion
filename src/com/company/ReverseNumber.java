package com.company;

public class ReverseNumber {

    public static void main(String[] args) {
        ReverseNo(1824);
        System.out.println(sum);
        System.out.println( ReverseNo2(1824)) ;


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


    static int sum=0;
     static void ReverseNo(int n) {
        if (n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        ReverseNo(n/10);
    }
}

package com.company;

public class ReverseNumber {

    public static void main(String[] args) {
        ReverseNo(1824);
        System.out.println(sum);



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

package com.company;

public class ReverseString {
    public static void main(String[] args) {

        String str="shivam";
        int n=str.length();
        Reverse(str,n);


    }

     static void Reverse(String str,int n) {

        if (n==0){
            return ;
        }


         System.out.print(str.charAt(n-1));
        Reverse(str,n-1);

    }


}

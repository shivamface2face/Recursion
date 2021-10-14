package com.company;

public class Print1t0N1t0N {
    public static void main(String[] args) {
        Printnto1then1ton(5);
    }

     static void Printnto1then1ton(int n) {
         if (n==0){
             return ;
         }
         System.out.println(n);
         Printnto1then1ton(n-1);
         System.out.println(n);

    }
}

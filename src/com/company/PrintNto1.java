package com.company;

public class PrintNto1 {
    public static void main(String[] args) {


        Printnto1(5);

    }

         static void Printnto1(int n) {
        if (n==0){
            return ;
        }
             System.out.println(n);
          Printnto1(n-1);
    }
}

package com.company;

import java.util.Scanner;

public class Powerof2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

      boolean ans=  isPowerOf2(n);
        System.out.println(ans);



    }

      static boolean isPowerOf2(int n) {
          long i=1;
          while(i<n){
              i=i*2;
          }

          return i==n;

      }
}

package com.company;

public class SumofNto1 {
    public static void main(String[] args) {
        int ans=Sumofnumber(5);
        System.out.println(ans);
    }

      static int Sumofnumber(int n) {
          if (n<=1){
              return 1;
          }
          return n+Sumofnumber(n-1);
    }
}

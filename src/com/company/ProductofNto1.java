package com.company;

public class ProductofNto1 {
    public static void main(String[] args) {
      int ans=   Productofnto1(5);
        System.out.println(ans);
    }

        static int Productofnto1(int n) {

            if (n<=1){
                return 1;
            }
        return n*Productofnto1(n-1);




    }
}

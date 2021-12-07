package com.company;

public class GeekonacciNumber {
    public static void main(String[] args) {

        System.out.println(geekonky(6));
    }

   static int geekonky(int n) {

        if (n==1){
            return 1;
        }else if (n==2){
            return 3;
        }else if (n==3){
            return 2;
        }

        return geekonky(n-1)+geekonky(n-2)+geekonky(n-3);
    }


}

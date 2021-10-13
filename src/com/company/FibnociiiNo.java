package com.company;

public class FibnociiiNo {

    public static void main(String[] args) {

        System.out.println(FinoNumber(7));
    }

     static int FinoNumber(int n) {

        if (n<2){
            return n;
        }
        return FinoNumber(n-1)+FinoNumber(n-2);

    }
}

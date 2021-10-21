package Subset;

import java.util.Scanner;

public class RemoveCharacterfromString {
    public static void main(String[] args) {
        Skip("","baccad");

    }

      static void Skip(String p,String up) {
         if (up.isEmpty()){
             System.out.println(p);
             return;
         }
         char ch=up.charAt(0);

         if (ch=='a'){
             Skip(p,up.substring(1));
         }else {
             Skip(p+ch,up.substring(1));
         }

    }
}

package Subset;

public class SkipWordNotEqualtoanyWord {
    public static void main(String[] args) {
        String ans=SkipAppNotApple("asdfapp");
        System.out.println(ans);
    }

     static String SkipAppNotApple(String up) {
         if (up.isEmpty()){
             return "";
         }

         if (up.startsWith("app")&& !up.startsWith("apple")){
             return SkipAppNotApple(up.substring(3));
         }else {
             return up.charAt(0)+SkipAppNotApple(up.substring(1));
         }
    }
}

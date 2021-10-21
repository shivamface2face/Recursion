package Subset;

public class RemoveWordFromString {
    public static void main(String[] args) {
        String ans=SkipWord("bdapplefg");
        System.out.println(ans);
    }

     static String SkipWord(String up) {

        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("apple")){
            return SkipWord(up.substring(5));
        }else {
            return up.charAt(0)+SkipWord(up.substring(1));
        }

    }
}

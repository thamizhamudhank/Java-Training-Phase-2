package Day_8;

public class ReverseString {
    public static void main(String[] args) {
        String str = "moo lcsd";
        String str1 = "everyone";
        String str2 = "friends";
        for (int i = 0; i < str.length(); ) {
            String temp = "";
            for (int j = i; j < str.length(); j--) {
                if (str.charAt(j) == ' ') {
                    i--;
                    break;

                }
            }
        }
    }
}
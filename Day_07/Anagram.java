package Day_7;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str = "trewq";
        String str1 = "qwert";
        str = str.toLowerCase();
        str1 = str1.toLowerCase();
        char[] ch = str.toCharArray();
        char[] ch1 = str1.toCharArray();

        if (str.length() == str1.length()) {
        Arrays.sort(ch);
        Arrays.sort(ch1);
        boolean b=Arrays.equals(ch,ch1);
                if (b) {
                    System.out.println("it is anagram");
                }
                else {
                    System.out.println("it is not anagram");
                }
            }
        }
}
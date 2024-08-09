package Day_6;

public class Palindrome {
    public static void main(String[] args) {
        String str = "mom ";
        String str1 = new String();
        char[] ch = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            str1 = str1+str.charAt(i);
            }
        if (str1 == str) {
            System.out.println("it is palindrome");
        }
    }
}

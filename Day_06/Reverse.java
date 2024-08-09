package Day_6;

public class Reverse {
    public static void main(String[] args) {
        String str = "moo lcsd ";
        String str1 = new String();
        char[] ch = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            str1 = str1 + str.charAt(i);
        }
        System.out.println(str1);
    }
}

package Day_5;
import java.lang.String;
public class NewStr {
    public static void main(String[] args) {
        String s="Hello";
        char[] ch=s.toCharArray();
       System.out.println(s.charAt(0));
        System.out.println(s.substring(1));
        System.out.println(s.replace('H','N'));
}
}


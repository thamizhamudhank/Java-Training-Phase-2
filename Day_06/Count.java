package Day_6;
import java.lang.String;
public class Count {
    public static void main(String[] args) {
        String s="AAAAaaaa";
        int count=0;
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)=='A' || s.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}

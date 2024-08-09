package Day_9;

import java.util.Arrays;

public class RemoveSpace {
    public static void main(String[] args) {
        String str="Hello i   am thamizh";
        str=str.toLowerCase();
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)!=' '){
                System.out.print(str.charAt(i));
            }
        }
    }
}

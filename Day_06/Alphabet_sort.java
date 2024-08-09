package Day_6;

import java.util.Arrays;

public class Alphabet_sort {
    public static void main(String[] args) {
        String[] str = {"apple", "orange", "Banana"};
        for (int i = 0; i <str.length; i++) {
            String s=str[i];
            s .toLowerCase();
            str[i]=s;
        }
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
    }
}

package Day_8;

import java.util.Arrays;

public class DuplicateString {
    public static void main(String[] args) {
        String str = "  hello dfgh hello  ";
        str = str.trim();
        int count=0;
        str=' '+str;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) >='a' &&str.charAt(i+1)<='z') {
                if(str.charAt(i)==str.charAt(i)){
                    count++;
                }
            }
        }
        String[] ch = new String[count];
        str = str.trim();
        int ind = 0;
        for (int i = 0; i < str.length(); ) {
            String temp = "";
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(j) == ' ') {
                    i++;
                    break;
                } else {
                    i++;
                    temp += str.charAt(j);
                }
            }
            ch[ind++] = temp;
        }

        for (int k = 0; k <ch.length; k++) {
            boolean b=true;
            for (int j = 0; j < k; j++) {
                if(ch[j].equalsIgnoreCase(ch[k])) {
                    b=false;
                    break;
                }
            }
            if(b){
                int counts = 0;
                for (int j = 0; j < ch.length; j++) {
                    if (ch[k].equalsIgnoreCase(ch[j])){
                        counts++;
                    }
                }
                System.out.println(ch[k] + " - " + counts);
            }
        }
    }
}
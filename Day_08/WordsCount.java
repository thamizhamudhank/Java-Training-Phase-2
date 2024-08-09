package Day_8;

public class WordsCount {
    public static void main(String[] args) {
        String str = "hello dfgh hello ";
        str = str.trim();
        str=' '+str;
        int count=0;
        for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ' && str.charAt(i + 1) >='a' &&str.charAt(i+1)<='z') {
                    if(str.charAt(i)==str.charAt(i)){
                        count++;
                    }
                }
        } System.out.println(count);
    }
}

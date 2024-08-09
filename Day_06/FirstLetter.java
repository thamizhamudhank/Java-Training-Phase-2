package Day_6;

public class FirstLetter {
    public static void main(String[] args) {
        String str ="hello thamizh";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 ) {
                System.out.print(str.charAt(i));
                i++;
            }
            else if( str.charAt(i)==' '){
                System.out.println(str.charAt(i+1));
            }
        }
    }
}

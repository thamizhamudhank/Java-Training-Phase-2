package Day_6;

public class Upper {
    public static void main(String[] args) {
        String str=" hello thamizh";
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == 0) {
                System.out.print(str.charAt(i));
                i++;
            }
            else if (str.charAt(i) == ' ') {
                System.out.print(" ");
                System.out.print((char) (str.charAt(i+1) - 32));
                i++;            }
            else {
                System.out.print(str.charAt(i));
            }
        }
    }
}

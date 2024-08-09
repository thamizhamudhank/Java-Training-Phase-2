package Day_9;

public class tOGGLE {
    public static void main(String[] args) {

        String str = "hello world this is earth" ;
        str = str.trim();
        System.out.println(togg(str));

    }

    static String togg(String str) {
        String ss = "";
        for (int i = 0; i < str.length(); ) {
            String temp = "";
            for (int j = i; j < str.length(); j++) {
                i++;
                if (str.charAt(j) == ' ' && str.charAt(j+1) !=' ' ) {
                    break;
                } else {
                    temp += str.charAt(j);
                }
            }

            ss+=temp.substring(0,1);
            ss += temp.substring(1).toUpperCase() + ' ';

        }
        return ss;
    }

}

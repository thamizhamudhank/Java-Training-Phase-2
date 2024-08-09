package Day_6;

public class Frequency {
    public static void main(String[] args) {
        String str = " Hello,.0";
        str=str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        flag = false;
                    }
                }
                if (flag) {
                    int frequency = 0;
                    for (int j = 0; j < str.length(); j++) {
                        if (str.charAt(i) == str.charAt(j)) {
                            frequency++;
                        }
                    }
                    System.out.println(str.charAt(i) + "=" + frequency);
                }
            }
        }
    }
}

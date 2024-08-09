package Day_8;

public class ReplaceWithoutMethod {
    public static void main(String[] args) {
        String str = "hello everyone";
        String str1 = "everyone";
        String str2 = "friends";
        for (int i = 0; i < str.length(); ) {
            String temp = "";
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(j) == ' ') {
                    i++;
                    break;
                } else {
                    i++;
                    temp += str.charAt(j);
                    if (temp.equalsIgnoreCase(str1)) {
                        temp = " "+str2;
                    }
                }
            }
            System.out.print(temp);
        }
    }
}
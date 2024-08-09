package Day_6;

public class Replace {
    public static void main(String[] args) {
        String str = "Helloa";
        char[] ch = str.toCharArray();
        for (int i = 0; i <str.length(); i++) {
            if(ch[i]=='a'||ch[i]=='A'){
                System.out.println('1');
            }
            System.out.println(ch[i]);
        }
    }
}

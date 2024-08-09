package Day_7;

public class Sentence {
    public static void main(String[] args) {
        demo();
    }
    public static void demo() {
        String str = "hi hello everyone";
        String str1 = "everyone";
        String str2 = "friends";
        if (str.contains(str1)) {
            String a = str.replace(str1, str2);
            System.out.println(a);
        }
    }
}

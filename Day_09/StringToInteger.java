package Day_9;
//how to convert string to integer and integer to string int java
//"123"+1==124
public class StringToInteger {
    public static void main(String[] args) {
        String str="123";
        int num=1;
        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);

            num=num*10+ch;

        }
        System.out.println(num);
    }
}

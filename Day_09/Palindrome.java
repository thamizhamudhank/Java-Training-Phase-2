package Day_9;

public class Palindrome{
    public static void main(String[] args) {
        String str="momo";
        String str1=new String();
        char [] ch=str.toCharArray();
        for (int i =ch.length-1; i >=0 ; i--) {
            str1=str1+str.charAt(i);
        }
        if(str.equals(str1)){
            System.out.println("it is palindrome");
        }
        else {
            System.out.println("it is not palindrome");
        }
    }

}

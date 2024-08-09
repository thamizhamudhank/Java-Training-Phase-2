package Day_9;

public class RemoveChar {
    public static void main(String[] args) {
        String str="hello";
        char c='l';
        char ch[]=str.toCharArray();
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)!=c){
                System.out.println(str.charAt(i));
            }
        }

    }
}

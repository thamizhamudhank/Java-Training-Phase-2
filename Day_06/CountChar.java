package Day_6;
public class CountChar {
   static int CountChar(String str, char ch){
        int count=0;
       str=str.toLowerCase();
       if(ch>='a'&&ch<='z'){
           str=str.toLowerCase();
       }
       if(ch>='A'&& ch<='Z'){
           str=str.toUpperCase();
       }
       for (int i = 0; i <str.length(); i++) {
           if(str.charAt(i)==ch){
               count++;
           }
       }
       return count;
    }

    public static void main(String[] args) {
        String str="ThAamizh";
        char ch='Z';
        int ans=CountChar( str, ch);
            System.out.println(ans);
        }
}

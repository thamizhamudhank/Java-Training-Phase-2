package Day_9;

public class ReplaceString {
    public static void main(String[] args) {
        String str="hello world";
        String str2="world";
        String rep="thamizh";
        for (int i = 0; i <str.length(); i++) {
            if(str.contains(str2)){
                str= str.replace(str2,rep);
            }
        }
        System.out.println(str);
    }
}

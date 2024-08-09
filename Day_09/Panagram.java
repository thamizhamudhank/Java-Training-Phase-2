package Day_9;

public class Panagram {
    public static void main(String[] args) {
        String str="qwertyuiopasdfghjklzxcvbnm";
        boolean b=true;
        for (char i = 'a'; i <='z'; i++) {
            if(!str.contains(String.valueOf(i))){
                b=false;
                break;
            }
        }
            if(b){
                System.out.println("it is panagram");
            }
            else{
                System.out.println("it is not panagram");
            }
        }
}

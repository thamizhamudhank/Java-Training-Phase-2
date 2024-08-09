package Day_7;

public class Panagram {
    public static void main(String[] args) {
        String str = "qwertyuiopsdfghjklzxcvbnm";
        boolean present = true;
        for (char i= 'a'; i <= 'z'; i++) {
            if (!str.contains(String.valueOf(i))) {
                present = false;
                break;
            }
        }
            if(present){
        System.out.println("it is panagram");
        }
        else {
            System.out.println("it is not panagram");
        }
    }
}
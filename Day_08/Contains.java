package Day_8;

public class Contains {
    public static void contains(){
        String str="hello world";
        String con="world";

        for (int i = 0; i <str.length(); i++) {
            boolean b= true;
            if ((str.contains(con))){
                b=true;
            }
        }
        System.out.println("true");
    }

    public static void main(String[] args) {
        contains();
    }
}

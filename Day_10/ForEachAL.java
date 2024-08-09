package Day_10;

import java.util.ArrayList;

public class ForEachAL {
    public static void main(String[] args) {
        ArrayList a= new ArrayList();
        a.add(10);
        a.add(20);
        a.add("hello" );
        for (Object i : a){
            System.out.println(i);
        }
    }
}

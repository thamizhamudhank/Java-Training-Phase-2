package Day_13;

import java.util.ArrayList;

public class LinkedHashset {

    public static void main(String[] args) {
        ArrayList a=new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(20);
        LinkedHashset  l=new LinkedHashset(a);
        System.out.println(l);
    }
}

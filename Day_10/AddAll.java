package Day_10;

import java.util.ArrayList;

public class AddAll {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(10);;
        a.add(20);
        a.add(30);
        a.add(40);
        System.out.println(a);
        ArrayList a1=new ArrayList();
        a1.addAll(0,a);
        System.out.println(a1);
    }
}

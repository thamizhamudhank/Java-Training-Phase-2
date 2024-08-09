package Day_10;

import java.util.ArrayList;

public class AddElements {
    public static void main(String[] args) {
        ArrayList a =new ArrayList();
        a.add(20);
        a.add(30);
        a.add(40);
        ArrayList a1=new ArrayList();
        a1.add(1);
        a1.add(2);
        a1.addAll(1,a);
        System.out.println(a1);
    }
}

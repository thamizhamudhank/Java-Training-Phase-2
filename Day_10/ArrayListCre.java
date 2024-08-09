package Day_10;

import java.util.ArrayList;

public class ArrayListCre {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("hello");
        a.add(10);
        a.add('c');
        System.out.println(a);
        ArrayList a1=new ArrayList(10);
        a.add('l');
        a.add("world");
        a.add(20);
        System.out.println(a1);
        ArrayList a3 =new ArrayList(a);
        System.out.println(a3);
    }
}

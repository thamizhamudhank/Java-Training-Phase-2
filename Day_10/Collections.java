package Day_10;

import java.util.ArrayList;
public class Collections {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(20);
        a.add(3);
        a.add(21);


        ArrayList a2=new ArrayList(10);
        a2.add(5);
        a2.add(10);
        a2.add(20);



        ArrayList a3=new ArrayList();
        a3.add(4);
        a3.add(0);
        a3.add(23);
        a3.add(32);
        ArrayList a4=new ArrayList(a3);
        System.out.println(a4);
    }
}

package Day_10;

import java.util.ArrayList;
import java.util.Vector;

public class RetainAll {
    public static void main(String[] args) {
        ArrayList a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        ArrayList a1=new ArrayList<>();
        a1.ensureCapacity(5);
        a1.trimToSize();
        a1.add(1);
        a1.add(3);
        a1.retainAll(a);
        System.out.println(a1);
    }
}
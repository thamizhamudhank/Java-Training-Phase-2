package Day_11;

import java.util.ArrayList;

public class Check {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(10);
        a.add(20);
        a.add(1);
        a.add(10);
        a.add(20);
        a.add(1);
        a.add(10);
        a.add(20);
        a.add(90);
        a.add(1, 100);
        System.out.println(a);
    }
}
package Day_10;

import java.util.ArrayList;

public class IndexOf {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.remove(a.indexOf(30));
        System.out.println(a);
    }
}

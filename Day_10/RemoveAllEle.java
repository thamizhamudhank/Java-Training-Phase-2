package Day_10;

import java.util.ArrayList;

public class RemoveAllEle {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
//        a.remove(new Integer(20));
        a.removeAll(a);
        System.out.println(a);
    }
}

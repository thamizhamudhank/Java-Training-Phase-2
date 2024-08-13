package Day_12;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator__ {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>();
        arr.add("thamizh");
        arr.add('c');
        arr.add(20);
        arr.add("Rahul");
        arr.add(20.50f);
        Iterator i = arr.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}

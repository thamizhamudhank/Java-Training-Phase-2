package Day_13;

import java.util.HashSet;
import java.util.TreeSet;

//It internally uses the hashing technique.Based on hashing elements are arranged.
//Linked Hashset maintains insertion order.
//Tree set maintains sorted  order.
public class DSAHashset {
    public static void main(String[] args) {
        HashSet h=new HashSet();
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        System.out.println(h);
        TreeSet t=new TreeSet();
        t.add(100);
        t.add(300);
        t.add(200);
        System.out.println(t);
    }
}

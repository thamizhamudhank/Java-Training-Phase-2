package Day_13;

import java.util.HashMap;
//hashmap stores in the form of table.
public class DSAHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> h=new HashMap<>();
        h.put(01,"hello");
        h.put(02,"hello");
        h.put(03,"Welcome");
        h.put(10,"World");
        System.out.println(h.keySet());
        System.out.println(h);
        HashMap<Integer,String> hm=new HashMap<>();
        hm.putAll(h);
        System.out.println(hm);
    }
}

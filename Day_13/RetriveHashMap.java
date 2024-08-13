package Day_13;

import java.util.HashMap;

public class RetriveHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> h=new HashMap<>();
        h.put(01,"hello");
        h.put(02,"hello");
        h.put(03,"Welcome");
        System.out.println(h.containsKey(01));
        System.out.println(h.containsValue("hello"));
        System.out.println(h.entrySet());
        System.out.println(h.values());
        h.remove(01);
        for (Integer key: h.keySet()){
            System.out.println(key);
        }
        for (Integer key: h.keySet()){
            System.out.println(h.get(key));
        }
    }
}

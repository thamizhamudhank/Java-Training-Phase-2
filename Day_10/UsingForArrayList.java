package Day_10;

import java.util.ArrayList;

public class UsingForArrayList {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("he;llo");
        a.add(10);
        a.add('c');
        for (int i = 0; i <a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}

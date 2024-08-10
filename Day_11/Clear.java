package Day_11;

import java.util.LinkedList;

public class Clear {
    public static void main(String[] args) {
        LinkedList l= new LinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.clear();
//        if we use clear method then it will clear the size
//        and the starting value and ending value is null so th list consider it as empty
        System.out.println(l);
    }
}

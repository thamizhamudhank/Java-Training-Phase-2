package Day_11;

import java.util.LinkedList;

public class AddNode {
    public static void main(String[] args)  {
        LinkedList l=new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println("Before"+l);
        l.add(2,100);
        System.out.println("After"+l);
    }
}

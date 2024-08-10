package Day_11;

import java.util.LinkedList;
//Retriving elements from data .
public class RetriveElement {
    public static void main(String[] args) {
        LinkedList l= new LinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l.get(1));
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
    }
}

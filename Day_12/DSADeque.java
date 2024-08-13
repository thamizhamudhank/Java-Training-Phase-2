package Day_12;

import java.util.ArrayDeque;

public class DSADeque {
    public static void main(String[] args) {
         ArrayDeque d=new ArrayDeque();
        d.add(1);
        d.add(2);
        d.add(1);
        d.add(3);
        d.add(1);
        d.addFirst(10);
        d.addLast(10);
        d.add(4);
        System.out.println(d);
        d.poll();
        d.pollLast();
        System.out.println(d);
        System.out.println(d.removeFirstOccurrence(1));
        System.out.println(d);
        System.out.println(d.peekFirst());

    }
}

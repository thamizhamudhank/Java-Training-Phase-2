package Day_12;

import java.util.PriorityQueue;
//Add->offer(),add()
//Remove->poll(),remove(object)
//peek()
public class TestQueue {
    public static void main(String[] args) {
        PriorityQueue p=new PriorityQueue();
        p.offer(40);
        p.offer(20);
        p.offer(10);
        p.offer(30);
        System.out.println(p);
        System.out.println(p.peek());
        p.poll();
        System.out.println(p);
        System.out.println(p.size());
        System.out.println();
    }
}

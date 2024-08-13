package Day_12;

import java.util.Stack;

public class DSAstack {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s);
        System.out.println(s.peek());//it will show the top element's number
        System.out.println(s.search(10));//search the element where it is present in the stack
        System.out.println(s.empty());//check whether the stack is empty or not
        System.out.println(s.capacity());
    }
}

package Day_10;

import java.util.ArrayList;
public class SpecificIndex {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);//int Arraylist null and duplicate values are allowed.
        System.out.println(a);
        a.add(1,50);
        System.out.println(a);
    }
}

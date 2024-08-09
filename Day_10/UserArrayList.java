package Day_10;

import java.util.ArrayList;
import java.util.Scanner;

public class UserArrayList {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        Scanner sc=new Scanner(System.in);
        a.add(sc.nextLine());
        a.add(sc.nextInt());
        System.out.println(a);
    }
}

package Day_13;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDriver extends Students {
    StudentDriver(int rollno, String name, String branch, String college) {
        super(rollno, name, branch, college);
    }

    public static void main(String[] args) {
        ArrayList <Students>a = new ArrayList<Students>();
        a.add(new Students(1,"Thamizh","CSE","MEC"));
        a.add(new Students(2,"Nebu","CSE","MEC"));
        a.add(new Students(3,"sanjai","CSE","MEC"));
        a.add(new Students(4,"Mohan","CSE","MEC"));
        Scanner sc=new Scanner(System.in);
        int roll=sc.nextInt();
        for (Students s:a){
            if (s.rollno==roll){
                System.out.println(s);

            }
        }

    }
}

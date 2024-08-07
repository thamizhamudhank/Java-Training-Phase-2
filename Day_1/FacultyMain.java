package Day_1;

public class FacultyMain {
    public static void main(String[] args) {
        Faculty f1=new Faculty("venkatesh","FOSS",123,20000.00);
        Faculty f2=new Faculty("venkatesh","FOSS",123,20000.00);
        System.out.println(f1);
        System.out.println(f2.equals(f1));
        System.out.println(f2==f1);
        System.out.println(f2.hashcode()==f1.hashcode());
    }
}

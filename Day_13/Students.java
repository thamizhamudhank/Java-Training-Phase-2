package Day_13;

public class Students {
   int rollno;
   private String name;
   private String branch;
   private String college;

     Students(int rollno,String name,String branch,String college) {
        this.rollno = rollno;
        this.name = name;
        this.branch = branch;
        this.college = college;
    }
    public String toString() {
        return "Students rollno= "+rollno+" name= "+name+" branch= "+branch+" college= "+college;
    }
    public void display(){
        System.out.println("roll no = "+rollno);

    }
}

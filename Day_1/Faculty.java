package Day_1;

public class Faculty {
    String name;
    String sub;
    int id;
    double salary;

    Faculty(String name, String sub, int id, double salary) {
        this.name = name;
        this.sub = sub;
        this.id = id;
        this.salary = salary;
    }
@Override
    public String toString() {
        String s1 = "Name : "+name+" "+" Subject: "+sub+" Emp ID: "+id+" Salary: "+salary;
        return s1;
    }
    public boolean equals(Object o){
        Faculty f=(Faculty) o;
        boolean b=this.name.equals(f.name)&& this.sub.equals(sub)&&this.id==id&&this.salary==salary;
        return b;

    }
    public int hashcode(){
        int hc=name.hashCode()+sub.hashCode()+id+(int)salary;
        return hc;
    }
}

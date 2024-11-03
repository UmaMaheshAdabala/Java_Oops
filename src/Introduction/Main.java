package Introduction;

public class Main {

    public static void main(String[] args) {
        Student student1=new Student();
        Student student2=new Student(12, "Ganesh", 98);
        Student s;
        for(int i=0;i<10000000;i++){
            s=new Student();
        }
        System.out.println(student1.name);
        System.out.println(student2.name);
    }
}
class Student{
    int roll;
    String name;
    int marks;
    // Constructor whith no parameters
    // Using THIS to call another constructor By passing Default Values.
    Student(){
        this(11, "Umesh", 95);
    }
    // Constructor with values
    Student(int rno, String name, int marks){
        this.roll=rno;
        this.name=name;
        this.marks=marks;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Obj Garbage Collected");
    }
}
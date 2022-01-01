class Student{
    String name;
    float pr;

    public Student(String name, float pr) {
        this.name = name;
        this.pr = pr;
        System.out.println("The name of the stuednt is:"+name);
        System.out.println("The percentage is:"+pr);
    }
}
public class StuTest {
    public static void main(String[] args) {
        Student obj=new Student("Sachin",89f);

    }

    }



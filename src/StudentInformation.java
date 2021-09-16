class student {
    //    Creating a instance variable.
    int rollno;
    String name, course;
    double fee;

    student(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
        fee = 163000;
    }// end the constructer

    //    Creting the Display Method
    void display() {
        System.out.println(rollno + " " + name + " " + course + " " + fee);
    }//End the display mathod
}//End the class

// create a main class
public class StudentInformation {
    public static void main(String[] args) {
        student s1=new student(1,"Priyanshu Srivastava","B.Tech");
//        Calling a Mathod to print the value's.
        s1.display();
    }
}

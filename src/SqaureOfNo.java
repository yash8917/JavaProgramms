import java.util.Scanner;
public class SqaureOfNo {
    int y;//Creating the instance variable.

    public static void main(String[] args) {
        //creating the Scanner class object.
        Scanner sc=new Scanner(System.in);
        //creating the obj.
        SqaureOfNo s1=new SqaureOfNo();
        //s1.x=sc.nextInt();
        System.out.println("Enter the no");
        //get the user input statement.
        s1.y=sc.nextInt();
        //Print the value of sqare formate.
        System.out.println("Square of "+s1.y+" is :"+s1.y*s1.y);
    }
}

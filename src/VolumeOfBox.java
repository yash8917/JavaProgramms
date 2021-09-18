import java.util.Scanner;
class Box{
    //instance variable's
    double width;
    double height;
    double depth;
    //Creating a Method
    void volu(){
        System.out.println("The Volume of the Box is:\t"+width*height*depth);
    }
}
//This is the Main Method
public class VolumeOfBox {
    public static void main(String[] args) {
        // Create's a Object of a b1 of Box
        Scanner sc=new Scanner(System.in);
        Box b1=new Box();
        double vol;
        System.out.println("Enter the Width of the box:");
        b1.width=sc.nextInt();
        System.out.println("Enter the Height of the Box:");
        b1.height= sc.nextInt();
        System.out.println("Enter the Depth of the Box:");
        b1.depth=sc.nextInt();
        b1.volu();
        //vol= b1.depth*b1.height*b1.width;
       // System.out.println("The volume of the box is:\n"+vol);
    }

}

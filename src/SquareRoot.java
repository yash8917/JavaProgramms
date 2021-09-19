import java.lang.*;
class calculator{
    double i;
    double x= Math.sqrt(i);
}
public class SquareRoot {
    double i;
//    double x;
    public static void main(String[] args) {
        calculator a=new calculator();
        a.i = Integer.parseInt(args[0]);
        //a.x=Math.sqrt(a.i);
        System.out.println("Square root of the no is:"+a.x);
    }

}

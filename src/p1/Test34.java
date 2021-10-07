package p1;
class one{
    public int num1=90;
}
class two extends one{
   public int num1=67;
   public void display(){

       System.out.println(super.num1);// Print the 90
   }
}
public class Test34 {
    public static void main(String[] args) {
        two obj=new two();
//        obj.display();
        System.out.println(obj.num1);

    }
}

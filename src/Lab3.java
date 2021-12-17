//public class Lab3 {
//    public static void main(String[] args) {
//        System.out.println("WElcome");
//        Stu obj1=new Stu(23,new int[]{33,23_000,34,44,45});
//        obj1.display();
//    }
//}
////passing array as an argument
//class Stu{
//    int Rrollno;
//    int arr[];
//
//    public Stu(int Rrollno, int[] arr) {
//        this.Rrollno = Rrollno;
//        this.arr = arr;
//    }
//     public void display(){
//        System.out.println(Rrollno);
//        for (int res: arr) {
//            System.out.println(res);
//        }
//    }
//}
// use of static

public class Lab3 {
    public static void main(String[] args) {
        System.out.println("WElcome");
        Stu.Stu(23,new int[]{12,3,45,56});
//        Stu obj1=new Stu(23,new int[]{33,23_000,34,44,45});
//        obj1.display();
    }
}
//passing array as an argument
class Stu{
    static  int Rrollno;
   static int arr[];

    public static void Stu(int Rrollno1, int[] arr1) {
        Rrollno = Rrollno1;
        arr = arr1;
    }
    public static void display(){
        System.out.println(Rrollno);
        for (int res: arr) {
            System.out.println(res);
        }
    }
}

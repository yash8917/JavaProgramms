public class Lab3 {
    public static void main(String[] args) {
        System.out.println("WElcome");
        Stu obj1=new Stu(23,new int[]{33,23_000,34,44,45});
        obj1.display();
    }
}
//passing array as an argument
class Stu{
    int Rrollno;
    int arr[];

    public Stu(int Rrollno, int[] arr) {
        this.Rrollno = Rrollno;
        this.arr = arr;
    }
     public void display(){
        System.out.println(Rrollno);
        for (int res: arr) {
            System.out.println(res);
        }
    }
}
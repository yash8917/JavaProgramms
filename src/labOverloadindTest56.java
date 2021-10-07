class OverDemo{

    public void m1(String obj1){
        System.out.println("gla");
    }
    public void m1(Object obj1){
        System.out.println("hello");
    }
}
public class labOverloadindTest56 {
    public static void main(String[] args) {
        // create a anonymous obj
        new OverDemo().m1(null);
        OverDemo obj5=null;
    }
}

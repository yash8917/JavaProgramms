class parent{
    public static void m1(){
        System.out.println("ok");
    }
}

class child extends parent{
    public static void m1(){
        System.out.println("welcome");
    }
}
public class labTest890 {
    public static void main(String[] args) {
        child.m1();
    }
}

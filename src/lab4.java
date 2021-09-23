class Abc{
    public static final float pi;    //Static nhi hoga to instance block me hi initialize
                                    // krenge ager h to static block mai
    static {
        pi=3.14f;
    }
}

public class lab4 {
    public static void main(String[] args) {
    Abc obj=new Abc();
        System.out.println(obj.pi);

    }
}

public class Emp {
    private int id;
    private  int sal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}
 class Demo3{
    public static void main(String[] args) {
        Emp obj1=new Emp();
        obj1.setId(69);
        obj1.setSal(12_000);
        System.out.println("I'd of the person is:"+obj1.getId());
        System.out.println("Salary of the person is"+obj1.getSal());

    }

}
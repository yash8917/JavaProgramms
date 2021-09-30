//Anonymous Nested Class
//1.Abstract Modifier-->
//If u don't know the behaviour                 anonymous class ke bad me child class ka naam ata haics
//declare method with abstract modifier.                //narrowing does not allowedd
// If a class is having abstract method then it is mandatory to create the class with abstract modifier
//2.Interface
//-------------------------------
//abstract class Result{
//    abstract public void calculateResult();
//}
//class Second extends Result
//{
//    public void calculateResult(){
//        System.out.println("Welcome :)");
//    }
//}
//
//public class lab5TestAnonymousClass {
//    public static void main(String[] args) {
//        Second obj=new Second();
//        obj.calculateResult();
//    }
//}
//----------------------------------------------------------------------------=--------
//java 1.7
//interface Example
//interface i1
//{
//    public static final int a=0;
//    public abstract void m1(){
//        System.out.println("Hello");
//    }
//}
//class one implements i1{
//
//}
//public class Lab5TestAnonymousClass{
//    public static void main(String[] args) {
//        i1 obj=new i1() {
//            @Override
//            public void m1() {
//                System.out.println("welcome");
//            }
//        };
//
//    }
//
//}
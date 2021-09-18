// create a new class called Calculator with the following methods:
//1. A static method called powerInt(int num1,int num2)
//This method should return num1 to the power num2.
//2. A static method called powerDouble(double num1,int num2).
//This method should return num1 to the power num2.
//3. Invoke both the methods and test the functionalities.
//Hint: Use Math.pow(double,double) to calculate the power

import java.lang.*;
class Calculator{
    //create a static block
    static double PowerInt(int num1,int num2){
        return Math.pow(num1,num2);
    }//End of the block

    //create another static block
    static double PowerDoule(double num1,double num2){
        return Math.pow(num1, num2);
    }//End of the method
}//End of the class
public class Calcu {
    public static void main(String[] args) {
        Calculator p1=new Calculator();
        //calling the static block
        System.out.println(p1.PowerInt(2,3));
        System.out.println(p1.PowerDoule(2.0,4.0));
    }
}
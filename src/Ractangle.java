/*Write a program to print the area of two rectangles having sides (4,5) and (5,8)
respectively by creating a class named 'Rectangle' with two instance variables, length and breadth
and a  method named 'Area' which returns the area.
Initialise the object attributes by taking the input from the user in the constructor
 */
import java.lang.*;

import java.util.Scanner;

class Ractangle {
    //instance Variable
    int length;
    int breadth;

//create a constructer.
    public Ractangle() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length:");
        this.length =sc.nextInt();
        System.out.println("Enter the Breath:");
        this.breadth =sc.nextInt();
    }//End the constructer.

    //create a Method
    void Area(){
        System.out.println(length*breadth);
    }
    public static void main(String[] args) {
        Ractangle r1=new Ractangle();
        Ractangle r2=new Ractangle();
        r1.Area();
        r2.Area();
    }
}

public class Circle {
    double r,x,y;// x,y are the cordinates opf the circle, and r is the radious.
    //    creat a mathod of circumstance.
    double circumference(){
        return 2*3.14159*r;
    }


    //    create a mathod which returns the area of a circle.
    double Area(){
        return((22/7)*r*r);
    }
}


class circledemo{

    public static void main(String[] args) {
//        Create the object of a circle.
        Circle a= new Circle();
        a.x=0.0;
        a.y=0.0;
        a.r=5.0;
        System.out.println("Circumference is: " +a.circumference());
        System.out.println("Area is: " +a.Area());
    }

}

//pgm to create an abstract class Shape that contain an empty method name numberofsides()
//Fathima P Ajvad
//Roll no:27
import java.util.*;
abstract class Shape
{
   abstract void numberofsides();
}
class Rectangle extends Shape
{
    void numberofsides()
    {
       System.out.println("The number of sides of a rectangle is 4");
    }
    void calculatearea(double length,double width)
    {
       System.out.println("Area of rectangle:"+(length*width));
    }
}
class Triangle extends Shape
{
    void numberofsides()
    {
       System.out.println("The number of sudes of a triangle is 3");
    }
    void calculatearea(double base,double height)
    {
       System.out.println("Area of triangle:"+(0.5*base*height));
    }
}
class Hexagon extends Shape
{
    void numberofsides()
    {
       System.out.println("The number of sides of a hexagon is 6");
    }
    void calculatearea(double sidelength)
    {
       System.out.println("Area of hexagon:"+((3*Math.sqrt(3)/2)*Math.pow(sidelength,2)));
    }
}
class Shapearea
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       Rectangle rec=new Rectangle();
       Triangle tri=new Triangle();
       Hexagon hex=new Hexagon();
       rec.numberofsides();
       tri.numberofsides();
       hex.numberofsides();
       System.out.println("Enter length and width for rectangle:");
       double length=s.nextDouble();
       double width=s.nextDouble();
       rec.calculatearea(length,width);
       System.out.println("Enter base and height for triangle:");
       double base=s.nextDouble();
       double height=s.nextDouble();
       tri.calculatearea(base,height);
       System.out.println("Enter side length for hexagon:");
       double sidelength= s.nextInt();
       hex.calculatearea(sidelength);
       s.close();
     }
}

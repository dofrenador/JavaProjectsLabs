package Labs;
import java.util.*;
import java.lang.Math;

public class Lab2 {
  public static void main(String args[])
  {
      Scanner input = new Scanner(System.in);

      double lengthOfRectangle;
      double widthOfRectangle;
      double radiusOfCircle;
      double radiusOfCylinder;
      double radiusOfSphere;
      double a;        //a side of a triangle
      double b;       // a side of a triangle
      double c;       // a side of a triangle
      double heightOfRectangularPrism;
      double heightOfCylinder;
      double d;       // diameter of the rectangular prism
      double widthOfRectangularPrism;




      System.out.print("Enter the width of a rectangle: ");
      widthOfRectangle = input.nextDouble();
      System.out.print("Enter the length of a rectangle: ");
      lengthOfRectangle = input.nextDouble();
      System.out.print("Enter the radius of a circle radius: ");
      radiusOfCircle = input.nextDouble();
      System.out.print("Enter the radius of a sphere: ");
      radiusOfSphere = input.nextDouble();
      System.out.print("Enter the radius of a cylinder: ");
      radiusOfCylinder = input.nextDouble();
      System.out.print("Enter the value of a: ");
      a = input.nextDouble();
      System.out.print("Enter the value of b: ");
      b = input.nextDouble();
      System.out.print("Enter the value of c: ");
      c = input.nextDouble();
      System.out.print("Enter the value of height of a rectangular prism: ");
      heightOfRectangularPrism = input.nextDouble();
      System.out.print("Enter the value of d: ");
      d = input.nextDouble();
      System.out.print("Enter the value of height of a cylinder: ");
      heightOfCylinder = input.nextDouble();
      System.out.print("Enter the value of width of a rectangular prism: ");
      widthOfRectangularPrism = input.nextDouble();

      double perimeterOfRectangle = 2 * (lengthOfRectangle + widthOfRectangle);
      System.out.println("Perimeter of a rectangle is: " + perimeterOfRectangle);

      double areaOfRectangle = widthOfRectangle * lengthOfRectangle;
      System.out.println("Area of a rectangle is: " + areaOfRectangle);

      double circumferenceOfCircle = 2 * Math.PI * radiusOfCircle;
      System.out.println("Circumference of a circle is: " + circumferenceOfCircle);

      double areaOfCircle = Math.PI * radiusOfCircle * radiusOfCircle;
      System.out.println("Area of a circle is: " + areaOfCircle);

      double perimeterOfTriangle = a + b + c;
      System.out.println("Perimeter of a triangle is: " + perimeterOfTriangle);

      double areaOfTriangle = heightOfRectangularPrism * (b / 2);
      System.out.println("Area of a triangle is: " + areaOfTriangle);

      double areaOfSphere = 4 * Math.PI * radiusOfSphere * radiusOfSphere;
      System.out.println("Surface area of a sphere is: " + areaOfSphere);

      double volumeOfSphere = (4 * Math.PI * radiusOfSphere * radiusOfSphere * radiusOfSphere) / 3;
      System.out.println("Volume of a sphere is: " + volumeOfSphere);

      double surfaceAreaOfRectangularPrism = 2 * ((heightOfRectangularPrism * d) + (heightOfRectangularPrism * widthOfRectangularPrism) + (d * widthOfRectangularPrism));
      System.out.println("Surface area of a rectangular prism is: " + surfaceAreaOfRectangularPrism);

      double volumeOfRectangularPrism = heightOfRectangularPrism * widthOfRectangularPrism * d;
      System.out.println("Volume of a rectangular prism is: " + volumeOfRectangularPrism);

      double surfaceAreaOfCylinder = 2 * Math.PI * radiusOfCylinder * heightOfCylinder + 2 * Math.PI * radiusOfCylinder * radiusOfCylinder;
      System.out.println("Surface area of a cylinder is: " + surfaceAreaOfCylinder);

      double volumeOfCylinder = Math.PI * radiusOfCylinder * radiusOfCylinder * heightOfCylinder;
      System.out.println("Volume of a cylinder is: " + volumeOfCylinder);

      input.close();

  }

}

package abc;
import java.util.Scanner;

abstract class Shapes {
 abstract void area();
}
 	
class Circle extends Shapes {
 void area() {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter radius : ");
     double r = sc.nextDouble();
     double result = Math.PI * r * r;
     System.out.println("Area of Circle: " + result);
 }
}
class Square extends Shapes {
    void area() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of the square: ");
        int side = sc.nextInt();
        int result = side * side;
        System.out.println("Area of Square: " + result);
    }
}
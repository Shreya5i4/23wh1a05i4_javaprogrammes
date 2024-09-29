
/*2. Write a java program to create an interface named Shape that contains two integers and an
empty method named printArea (). Provide three classes named Rectangle, Triangle and
Circle such that each one of the classes implements the class Shape. Each one of the classes
contains only the method printArea () that prints the area of the given shape*/
// Define the Shape interface
import java.util.*;
interface Shape {
    
    void printArea();
}

class Rectangle implements Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

   
    public void printArea() {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle implements Shape {
    private int base;
    private int height;

   
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

   
    public void printArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

   
    public void printArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get Rectangle dimensions from user
        System.out.print("Enter length of Rectangle: ");
        int rectangleLength = scanner.nextInt();
        System.out.print("Enter width of Rectangle: ");
        int rectangleWidth = scanner.nextInt();
        Shape rectangle = new Rectangle(rectangleLength, rectangleWidth);
        rectangle.printArea();

        System.out.print("Enter base of Triangle: ");
        int triangleBase = scanner.nextInt();
        System.out.print("Enter height of Triangle: ");
        int triangleHeight = scanner.nextInt();
        Shape triangle = new Triangle(triangleBase, triangleHeight);
        triangle.printArea();

        System.out.print("Enter radius of Circle: ");
        int circleRadius = scanner.nextInt();
        Shape circle = new Circle(circleRadius);
        circle.printArea();

        scanner.close();
    }
}
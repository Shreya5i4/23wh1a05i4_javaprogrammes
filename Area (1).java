/*3. Define a class named Area which can be constructed by radius, length, and width.The Area
class have two methods : carea() to calculate area of circle and rarea() to calculate area of
rectangle*/
import java.util.Scanner;

class Area {
    private double radius;
    private double length;
    private double width;

    public Area(double radius) {
        this.radius = radius;
    }

    public Area(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double carea() {
        return Math.PI * radius * radius;
    }

    public double rarea() {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of Circle: ");
        double circleRadius = scanner.nextDouble();
        Area circle = new Area(circleRadius);
        System.out.println("Area of Circle: " + circle.carea());

        System.out.print("Enter length of Rectangle: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        Area rectangle = new Area(rectangleLength, rectangleWidth);
        System.out.println("Area of Rectangle: " + rectangle.rarea());

        scanner.close();
    }
}

abstract class Shape {
    // Abstract methods
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Rectangle subclass
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "Rectangle: Length-" + length + ", Width-" + width;
    }
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle: Radius-" + radius;
    }
}

// Triangle subclass
class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public double calculateArea() {
        double s = calculatePerimeter() / 2; // semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Heron's formula
    }

    public String toString() {
        return "Triangle: Side1-" + side1 + ", Side2-" + side2 + ", Side3-" + side3;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        // Create instances of shapes
        Shape rectangle = new Rectangle(10, 12);
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(7, 8, 6);

        System.out.println("Area and perimeter of various shapes:\n");

        // Rectangle
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter() + "\n");

        // Circle
        System.out.println(circle);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter() + "\n");

        // Triangle
        System.out.println(triangle);
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}
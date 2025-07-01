public class Circle {
    // Attribute
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // Create a Circle object with radius 5
        Circle circle = new Circle(5);

        // Display initial details
        System.out.println("Radius of the circle is " + circle.getRadius());
        System.out.println("The area of the circle is " + circle.calculateArea());
        System.out.println("The circumference of the circle is " + circle.calculateCircumference());

        // Modify radius
        circle.setRadius(8);

        // Display updated details
        System.out.println("Radius of the circle is " + circle.getRadius());
        System.out.println("The area of the circle is now " + circle.calculateArea());
        System.out.println("The circumference of the circle is now " + circle.calculateCircumference());
    }
}
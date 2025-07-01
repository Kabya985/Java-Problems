public class Rectangle {
    // Attributes
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Setter methods
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate area
    public double calculateArea() {
        return width * height;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rect = new Rectangle(12.0, 7.0);

        // Print initial area and perimeter
        System.out.println("The area of the rectangle is " + rect.calculateArea());
        System.out.println("The perimeter of the rectangle is " + rect.calculatePerimeter());

        // Modify width and height
        rect.setWidth(9.0);
        rect.setHeight(8.0);

        // Print updated area and perimeter
        System.out.println("The area of the rectangle is now " + rect.calculateArea());
        System.out.println("The perimeter of the rectangle is now " + rect.calculatePerimeter());
    }
}
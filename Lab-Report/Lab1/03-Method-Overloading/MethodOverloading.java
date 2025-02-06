class MethodOverloading {
    // Method to calculate area of a rectangle (length * width)
    public double fingArea(double length, double width) {
        return length * width;
    }

    // Overloaded method to calculate area of a circle (π * radius^2)
    public double fingArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        MethodOverloading calculator = new MethodOverloading();

        // Calculate and print area of rectangle
        double rectangleArea = calculator.fingArea(5.0, 3.0);
        int sum = 2 + 2;
        System.out.println("Area of Rectangle: " + rectangleArea);

        // Calculate and print area of circle
        double circleArea = calculator.fingArea(4.0);
        System.out.println("Area of Circle: " + circleArea);
    }
}

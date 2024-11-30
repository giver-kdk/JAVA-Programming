package chapter1;

public class MethodOverriding_02 {
    // Add two integers
    int sum(int x, int y) {
        return x + y;
    }

    // Add three integers
    int sum(int x, int y, int z) {
        return x + y + z;
    }

    // Add two floating-point numbers
    double sum(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        MethodOverriding_02 calc = new MethodOverriding_02();
        
        // Test integer addition
        System.out.println("Sum of two integers: " + calc.sum(10, 20));
        System.out.println("Sum of three integers: " + calc.sum(10, 20, 30));
        
        // Test floating-point addition
        System.out.println("Sum of two decimals: " + calc.sum(10.5, 20.3));
    }
}

}

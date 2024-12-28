public class BalancedArray {

    public static int isBalanced(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Check even-indexed elements (0, 2, ...)
            if (i % 2 == 0 && arr[i] % 2 != 0) {
                return 0; // Not balanced, even index but odd number
            }
            // Check odd-indexed elements (1, 3, ...)
            if (i % 2 != 0 && arr[i] % 2 == 0) {
                return 0; // Not balanced, odd index but even number
            }
        }
        return 1; // Balanced
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 4, 3, 6, 5}; // Balanced array
        int[] arr2 = {2, 1, 4, 3, 6, 8}; // Not balanced (arr[5] is even)
        int[] arr3 = {1, 2, 3, 4};       // Not balanced (arr[0] is odd)
        
        System.out.println(isBalanced(arr1)); // Output: 1
        System.out.println(isBalanced(arr2)); // Output: 0
        System.out.println(isBalanced(arr3)); // Output: 0
    }
}

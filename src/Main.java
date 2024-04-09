import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sec = new Scanner(System.in);
        int n = sec.nextInt();

        System.out.println(func(n));
    }

    /**
     * This function calculates the nth Fibonacci number recursively.
     *
     * @param n The index of the Fibonacci number to be calculated (0-based indexing).
     * @return The nth Fibonacci number.
     *
     * @throws IllegalArgumentException if n is negative.
     */
    public static int func(int n) {

        // Base case: The first Fibonacci number is 1
        if (n == 1) {
            return 1;
        }

        // Handle negative input (optional)
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        // Recursive case: nth Fibonacci number is the sum of the (n-1)th and (n-2)th Fibonacci numbers
        return n * func(n - 1);
    }
}
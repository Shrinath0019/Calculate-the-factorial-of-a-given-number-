import java.util.Scanner;

public class FactorialCalculator {

    // Iterative Method to calculate factorial
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive Method to calculate factorial
    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a non-negative integer to calculate its factorial: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                // Iterative calculation
                long iterativeResult = factorialIterative(number);
                System.out.println("Factorial (Iterative): " + iterativeResult);

                // Recursive calculation
                long recursiveResult = factorialRecursive(number);
                System.out.println("Factorial (Recursive): " + recursiveResult);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
        } finally {
            scanner.close();

        }
    }
}

import java.util.Scanner;

public class recursionMethod {
    // Recursive method to calculate factorial
    public static int calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1; // Base case
        }
        return number * calculateFactorial(number - 1); // Recursive case
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calling the recursive method
            int factorial = calculateFactorial(num);
            System.out.println("The factorial of " + num + " is: " + factorial);
        }
    }
}

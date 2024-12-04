import java.util.Scanner;

public class MethodDefining {
    // Method to calculate square
    public static int calculateSquare(int number){
        return number*number;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number to find its square: ");
        int n = scan.nextInt();

        // Calling the method
        int square = calculateSquare(n);
        System.out.println("the square of the number "+n+" is " + square);
    }
}

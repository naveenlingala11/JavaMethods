import java.util.Scanner;

public class MethodOverloading {// Overloaded methods to calculate area
    public static int calculateArea(int side) {
        return side * side; // Area of a square
    }

    public static int calculateArea(int length, int breadth) {
        return length * breadth; // Area of a rectangle
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius; // Area of a circle
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1 for Square, 2 for Rectangle, 3 for Circle: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the side of the square: ");
                int side = scanner.nextInt();
                System.out.println("Area of the square: " + calculateArea(side));
                break;
            case 2:
                System.out.print("Enter the length and breadth of the rectangle: ");
                int length = scanner.nextInt();
                int breadth = scanner.nextInt();
                System.out.println("Area of the rectangle: " + calculateArea(length, breadth));
                break;
            case 3:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of the circle: " + calculateArea(radius));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
import java.util.Scanner;

public class LogicalOperator_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();

        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();

        // Check if a is the biggest
        if (a > b && a > c) {
            System.out.println("a is the biggest");
        } else {
            System.out.println("a is not the biggest");
        }

        // Check if there is at least one value smaller than a
        if (b < a || c < a) {
            System.out.println("There is at least one value smaller than a");
        } else {
            System.out.println("All values are greater than or equal to a");
        }

        // Check if a is positive, negative or zero
        if (a > 0) {
            System.out.println("a is positive");
        } else if (a < 0) {
            System.out.println("a is negative");
        } else {
            System.out.println("a is zero");
        }

        scanner.close();
    }
}

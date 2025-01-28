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
        
        scanner.nextLine()
        System.out.print("Enter value for d: ");
        String d = scanner.nextLine();
        

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

        if (d.equals("tanbir")) {
            System.out.println("hello you tanbir");
        } else if(!d.equals("tanbir")) {
            System.out.println("I don't know you");
        }

        scanner.close();
    }
}

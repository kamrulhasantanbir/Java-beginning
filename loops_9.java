import java.util.Scanner;

public class loops_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Using a for loop
        int sumFor = 0;
        for (int i = 0; i <= n; i++) {
            sumFor += i;
        }
        System.out.println("Sum using for loop: " + sumFor);

        // Using a while loop
        int sumWhile = 0;
        int i = 0;
        while (i <= n) {
            sumWhile += i;
            i++;
        }
        System.out.println("Sum using while loop: " + sumWhile);

        // Using a do-while loop
        int sumDoWhile = 0;
        int j = 0;
        do {
            sumDoWhile += j;
            j++;
        } while (j <= n);
        System.out.println("Sum using do-while loop: " + sumDoWhile);

        scanner.close();
    }
}

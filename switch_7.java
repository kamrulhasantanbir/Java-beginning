import java.util.Scanner;

public class switch_7 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter a number (0-9): ");
        int num = cin.nextInt();

        switch (num) {
            case 0:
                System.out.println("You entered 0");
                break;
            case 1:
                System.out.println("You entered 1");
                break;
            case 2:
                System.out.println("You entered 2");
                break;
            case 3:
                System.out.println("You entered 3");
                break;
            case 4:
                System.out.println("You entered 4");
                break;
            case 5:
                System.out.println("You entered 5");
                break;
            case 6:
                System.out.println("You entered 6");
                break;
            case 7:
                System.out.println("You entered 7");
                break;
            case 8:
                System.out.println("You entered 8");
                break;
            case 9:
                System.out.println("You entered 9");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 0 and 9.");
                break;
        }

        cin.close();
    }
}

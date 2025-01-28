import java.util.Scanner;

public class Array_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of int array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Num " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.print("\nEnter size of string array: ");
        int m = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[m];

        System.out.println("Enter " + m + " strings:");
        for (int i = 0; i < m; i++) {
            System.out.print("Str " + (i + 1) + ": ");
            strs[i] = sc.nextLine();
        }


        System.out.println("\nInt array:");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();


        System.out.println("\nString array:");
        for (String s : strs) {
            System.out.print(s + " ");
        }
        System.out.println();

        sc.close();
    }
}

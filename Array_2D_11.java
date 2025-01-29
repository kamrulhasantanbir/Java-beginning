import java.util.Scanner;

public class Array_2D_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined Integer 2D Array
        int[][] intArray1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Predefined String 2D Array
        String[][] stringArray = {
                {"One", "Two", "Three"},
                {"Four", "Five", "Six"},
                {"Seven", "Eight", "Nine"}
        };

        // Taking input for a new Integer 2D Array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] intArray2 = new int[rows][cols];

        System.out.println("Enter elements for the new integer 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                intArray2[i][j] = scanner.nextInt();
            }
        }

        // Printing Predefined Integer 2D Array
        System.out.println("\nPredefined Integer 2D Array:");
        for (int i = 0; i < intArray1.length; i++) {
            for (int j = 0; j < intArray1[i].length; j++) {
                System.out.print(intArray1[i][j] + " ");
            }
            System.out.println();
        }

        // Printing Predefined String 2D Array
        System.out.println("\nPredefined String 2D Array:");
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                System.out.print(stringArray[i][j] + " ");
            }
            System.out.println();
        }

        // Printing User-Input Integer 2D Array
        System.out.println("\nUser-Input Integer 2D Array:");
        for (int i = 0; i < intArray2.length; i++) {
            for (int j = 0; j < intArray2[i].length; j++) {
                System.out.print(intArray2[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

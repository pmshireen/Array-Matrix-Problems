package Matrix;

import java.util.Scanner;

public class MatrixAdd {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = scanner.nextInt();

        int a[][] = new int[rows][col];
        int b[][] = new int[rows][col];

        // Get values for matrix 'a'
        System.out.println("Enter the values for matrix 'a':");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        // Get values for matrix 'b'
        System.out.println("Enter the values for matrix 'b':");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = scanner.nextInt();
            }
        }



        // Creating another matrix to store the sum of two matrices
        int c[][] = new int[rows][col];

        // Adding and printing addition of 2 matrices
        System.out.println("Matrix addition result:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                c[i][j] = a[i][j] - b[i][j]; // use - for subtraction
                System.out.print(c[i][j] + " ");
            }
            System.out.println(); // new line
        }
    }
}


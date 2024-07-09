package Matrix;

import java.util.Scanner;

public class MatrixIdentical {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of rows: ");
//        int rows = scanner.nextInt();
//        System.out.print("Enter the number of columns: ");
//        int col = scanner.nextInt();
//
//        int a[][] = new int[rows][col];
//        int b[][] = new int[rows][col];
//
//        // Get values for matrix 'a'
//        System.out.println("Enter the values for matrix 'a':");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < col; j++) {
//                a[i][j] = scanner.nextInt();
//            }
//        }
//
//        // Get values for matrix 'b'
//        System.out.println("Enter the values for matrix 'b':");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < col; j++) {
//                b[i][j] = scanner.nextInt();
//            }
//        }
//        boolean result = identicalMatrix(a, b);
//        System.out.println(result);
          rowAndColSum();
    }

    public static boolean identicalMatrix(int[][] a, int[][] b) {
        boolean flag = true;
        int row1 = a.length;
        int col1 = a[0].length;

        int row2 = b.length;
        int col2 = b[0].length;

        if (row1 != row2 || col1 != col2) {
            System.out.println("Matrices are not equal");
        } else {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    if (a[i][j] != b[i][j]) {
                        flag = false;
                        break;
                    }
                }
            }
        }
        return flag;
    }

    public static void rowAndColSum(){
        int a[][] = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9}
        };
        int row = a.length;
        System.out.println("row "+row);
        int col = a[row].length;

        System.out.println("col "+col);

        //calculate the sum of each row of matrix
        for(int i =0;i<row;i++){
            int sumRow=0;
            for(int j = 0;j<col;j++){
                sumRow = sumRow+a[i][j];
            }
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);
        }




    }
}
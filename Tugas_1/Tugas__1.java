
package Tugas_1;


import java.util.Scanner;

public class Tugas__1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input baris kolom matriks: ");
        int rows = scanner.nextInt();
        int cols = rows;

        int[][] matrix = new int[rows][cols];


        System.out.println("Input nilai untuk matriks:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Input nilai " + (i + 1) + "," + (j + 1) + " = ");
                matrix[i][j] = scanner.nextInt();
            }
        }


        System.out.println("\nMatriks asli:");
        printMatrix(matrix);


        int[][] transpose = transposeMatrix(matrix);


        System.out.println("\nMatriks transpose:");
        printMatrix(transpose);


        int[][] sumMatrix = addMatrices(matrix, transpose);

        System.out.println("\nJumlahkan matriks asli dengan transposenya:");
        printMatrix(sumMatrix);

        scanner.close();
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
}

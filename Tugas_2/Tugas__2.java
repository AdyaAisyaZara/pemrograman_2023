package Tugas_2;

import java.util.ArrayList;
import java.util.List;

public class Tugas__2 {
    public static void main(String[] args) {
        List<List<Integer>> matriks = new ArrayList<>();

        List<Integer> baris1 = new ArrayList<>();
        baris1.add(1);
        baris1.add(2);
        baris1.add(3);

        List<Integer> baris2 = new ArrayList<>();
        baris2.add(4);
        baris2.add(5);
        baris2.add(6);

        List<Integer> baris3 = new ArrayList<>();
        baris3.add(7);
        baris3.add(8);
        baris3.add(9);

        matriks.add(baris1);
        matriks.add(baris2);
        matriks.add(baris3);

        System.out.println("Matriks asli:");
        printMatrix(matriks);

        List<List<Integer>> transpose = transposeMatrix(matriks);

        System.out.println("\nMatriks transpose:");
        printMatrix(transpose);

        List<List<Integer>> sumMatrix = addMatrices(matriks, transpose);

        System.out.println("\nJumlahkan matriks asli dengan transposenya:");
        printMatrix(sumMatrix);
    }

    public static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            for (Integer val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> transposeMatrix(List<List<Integer>> matrix) {
        int rows = matrix.size();
        int cols = matrix.get(0).size();
        List<List<Integer>> transpose = new ArrayList<>();
        for (int i = 0; i < cols; i++) {
            List<Integer> newRow = new ArrayList<>();
            for (int j = 0; j < rows; j++) {
                newRow.add(matrix.get(j).get(i));
            }
            transpose.add(newRow);
        }
        return transpose;
    }

    public static List<List<Integer>> addMatrices(List<List<Integer>> matrix1, List<List<Integer>> matrix2) {
        int rows = matrix1.size();
        int cols = matrix1.get(0).size();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            List<Integer> newRow = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                newRow.add(matrix1.get(i).get(j) + matrix2.get(i).get(j));
            }
            result.add(newRow);
        }
        return result;
    }
}


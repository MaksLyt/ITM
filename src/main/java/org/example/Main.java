package org.example;
public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[][] matrix2 = {
                {17, 18, 19, 20},
                {21, 22, 23, 24},
                {25, 26, 27, 28},
                {29, 30, 31, 32}
        };
        System.out.println("Матриця 1:");
        printMatrix(matrix1);
        System.out.println("Матриця 2:");
        printMatrix(matrix2);
        int[][] sumMatrix = addMatrices(matrix1, matrix2);
        System.out.println("Сума матриць:");
        printMatrix(sumMatrix);
        int[][] productMatrix = multiplyMatrices(matrix1,
                matrix2);
        System.out.println("Добуток матриць:");
        printMatrix(productMatrix);
    }
    // Метод для додавання двох матриць
    public static int[][] addMatrices(int[][] matrix1, int[][]
            matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        if (rows1 != rows2 || cols1 != cols2) {
            throw new IllegalArgumentException("Матриці мають різний розмір");
        }
        int[][] result = new int[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
    // Метод для множення двох матриць
    public static int[][] multiplyMatrices(int[][] matrix1,
                                           int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        if (rows1 != cols2) {
            throw new IllegalArgumentException("Розмір матриць не підходить для множення");
        }
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
    // Метод для виведення матриці на екран
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[][] matrix1 = {{1,2}, {3, 4}};
//        int[][] matrix2 = {{5,6}, {7,8}};
        int[][] matrix1 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] matrix2 = {{7, 8, 9}, {10, 11, 12}};
        multiply(matrix1, matrix2);
    }

    public static void multiply(int[][] matrix1, int[][] matrix2) {
        int[][] matrix12 = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix12.length; i++) {
            for (int j = 0; j < matrix12[0].length; j++) {
                matrix12[i][j] = getProduct(i, j, matrix1, matrix2);
            }
        }
        printMatrix(matrix12);
    }

    public static int getProduct(int i, int j, int[][] matrix1, int[][] matrix2) {
        int product = 0;
        int num1 = 0;
        int num2 = 0;
        int[] row = matrix1[i];
        int[] col = new int[matrix2.length];
        for (int k = 0; k < matrix2.length; k++) {
            col[k] = matrix2[k][j];
        }
        int[] add = new int[matrix2.length];
        for (int l = 0; l < row.length; l++) {
            add[l] = row[l] * col[l];
        }
        for (int m = 0; m < add.length; m++) {
            product += add[m];
        }
        return product;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

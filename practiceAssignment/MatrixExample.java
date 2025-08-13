// 5. Write a java program to add the 2X3 matrix.

package practiceAssignment;

public class MatrixExample {
    int[][] matrix_1;
    int[][] matrix_2;
    int[][] sum;

    public MatrixExample() {
        matrix_1 = new int[][] {
            {1, 2, 3},
            {4, 5, 6}
        };

        matrix_2 = new int[][] {
            {7, 8, 9},
            {10, 11, 12}
        };

        sum = new int[2][3];
    }

    public void addMatrix() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }

        System.out.println("The sum of 2x3 matrices is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }                     
    }
}

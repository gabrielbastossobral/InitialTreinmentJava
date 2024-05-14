package academy.devdojo.maratonajava.introducao;

public class MultidimensionalArrayExercise {
    public static void main(String[] args) {
        // Exercise: Sum of Matrices
        //
        //Create a program that realize the sum of two matrices and store the result in a third matrix.

        int[][] matrix1 = {{1, 5, 10}, {10, 15, 20}};
        int[][] matrix2 = {{9, 13, 24}, {30, 32, 17}};
        int[][] sum = new int [2][3];

        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[i].length; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.println(sum[i][j]);
            }
        }
    }
}

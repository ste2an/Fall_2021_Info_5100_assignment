package assignment2.leetcode;

public class RotateImage {
    public static void main(String[] args) {

    }

    public void rotate(int[][] matrix) {
        int row = matrix.length;

        if(row < 2) return;

        for(int i = 0; i < (row + 1) / 2; i ++){
            for(int j = 0 ; j < row / 2; j ++){

      //for(int i = 0; i < (row + 1) / 2; i ++){
         // for(int j = 0 ; j < row / 2; j ++){

                int tmp = matrix[i][j];
                matrix[i][j] = matrix[row - j - 1][i];
                matrix[row - j - 1][i] = matrix[row - i - 1][row - j - 1];
                matrix[row - i - 1][row - j - 1] = matrix[j][row - i - 1];
                matrix[j][row - i - 1] = tmp;
            }
        }

    }
}

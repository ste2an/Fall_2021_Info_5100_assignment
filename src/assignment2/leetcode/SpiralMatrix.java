package assignment2.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {

    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int row = matrix.length;
        int col = matrix[0].length;

        int startRow = 0, endRow = row - 1;
        int startCol = 0, endCol = col - 1;

        while(startRow <= endRow && startCol <= endCol){
            for(int i = startCol; i <= endCol ; i ++){
                res.add(matrix[startRow][i]);
            }
            startRow++;
            // direction : right

            for(int i = startRow; i <= endRow; i ++){
                res.add(matrix[i][endCol]);
            }
            endCol--;
            //direction : down

            // if(startRow > endRow || startCol > endCol){
            //     break;
            // }

            for(int i = endCol; i >= startCol; i --){
                res.add(matrix[endRow][i]);
            }
            endRow--;
            // direction : left

            for(int i = endRow; i >= startRow ; i--){
                res.add(matrix[i][startCol]);
            }
            startCol++;
            // direction : up
        }
        return res;
    }
}

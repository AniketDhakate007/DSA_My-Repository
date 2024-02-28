package questions;

import java.util.Arrays;

public class BinarySearchinMatrix {
        public static void main(String[] args) {
        int [][] mat={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(searchInMatrix(mat,11)));
    }

    static int[] searchInMatrix(int[][] matrix , int target){
        int row=0;
        int col=matrix.length-1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[] {row,col};
            }
            else if (matrix[row][col] > target ){
                col--;
            }else {
                row++;
            }
        }
    return new int[] {-1,-1};
    }
}

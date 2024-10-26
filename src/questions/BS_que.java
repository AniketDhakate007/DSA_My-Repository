package questions;

public class BS_que {
    public static boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }

        int col = matrix[0].length - 1;
        int row = 0;

        while(col >= 0 && row <= matrix.length){
            if (target == matrix[row][col]){
                return true;
            }
            else if(target < matrix[row][col]){
                col = col - 1;
            }
            else if (target > matrix[row][col]){
                row = row + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] arr = {{1,3,5,7,9},{2,4,6,8,12},{13,14,15,16,17}};
        boolean ans = searchMatrix(arr,4);
        System.out.println(ans);
    }
}

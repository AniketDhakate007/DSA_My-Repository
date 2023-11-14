package SearchAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInMatrix {
    public static void main(String [] args){
        int [][] arr={
                {12,15,20},
                {21,24,27},
                {29,33,35}
        };
        System.out.println("Enter element you want to search: ");
        Scanner s=new Scanner(System.in);
        int x= s.nextInt();
        System.out .println(Arrays.toString(search(arr,x)));

    }
    static int [] search(int [][] matr,int target){
        int row=0;
        int col=matr.length - 1;

        while (row< matr.length && col>=0){
            if (matr[row][col]==target){
                return new int [] {row,col};
            }
            if (matr[row][col] > target){
                col--;
            }
            else {
                row++;
            }
        }

     return new int[] {-1,-1};
    }
}

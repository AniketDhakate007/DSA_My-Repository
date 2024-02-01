package SortAlgo;

import java.util.Arrays;

public class BubbleSort {
    static void Bubble(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            boolean swapped=false;
            for (int j = 1; j < arr.length-i-1; j++) {
                if (arr[j] < arr[j-1]) {
                   //swap
                   int temp=arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
                   swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
    public static void main(String[] args){
        int[] nums={5,3,2,7,4,9,12};
        Bubble(nums);
        System.out.println(Arrays.toString(nums));
    }

}

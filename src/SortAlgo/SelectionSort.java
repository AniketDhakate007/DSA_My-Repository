package SortAlgo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,4,2,6,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for (int i=0; i<arr.length; i++){
            int finalIndex=arr.length-i-1;
            int max=maxIndex(arr,0,finalIndex);
            swap(arr,max,finalIndex);

        }



    }

    static int maxIndex(int[] arr, int start, int end) {
        int max=start;
        for (int i = start; i <=end; i++) {
            if (arr[i] > arr[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int max,int finalIndex){
        int temp=arr[max];
        arr[max]=arr[finalIndex];
        arr[finalIndex]=temp;

    }
}

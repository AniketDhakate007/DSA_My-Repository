package SortAlgo;

import java.util.*;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //for 1 to n;
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){

            if (arr[i] !=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}


package Recursion_and_BackTracking;

public class BubbleSort_rec {
    static void sort(int[] arr,int i, int j){
        if (i==0){
            return;
        }
        if (i<j){
            if (arr[j]>arr[j+1]){
                //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            sort(arr,i,j+1);
        }
        else {
            sort(arr, i - 1, 0);
        }
    }
//
//    public static void main(String[] args) {
//        int[] arr = {1,3,5,4,2,21,12,14,31,9};
//        System.out.println(sort(arr,));
//    }
}

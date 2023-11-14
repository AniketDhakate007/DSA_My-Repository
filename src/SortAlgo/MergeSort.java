package SortAlgo;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] arr={3,5,7,4,2};
        mergeSort(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));


    }
    static void mergeSort(int[] arr,int s,int e){
        if (s-e == 0) {
            return;
        }
        int m = s+ (e-s)/2;

        mergeSort(arr,s,m);
        mergeSort(arr,m,e);

        merge(arr,s,m,e);

    }
    static void merge(int[] arr , int s, int m, int e)
    {
        int[] mixed= new int[e-s];

        int i=s;
        int j=m;
        int k=0;

        while (i<m && j<e){
            if (arr[i] < arr[j]) {
                mixed[k] = arr[i];
                i++;
            }
            else {
                mixed[k] =arr[j];
                j++;

            }
            k++;
        }
        while (i<m)
        {
            mixed[k]=arr[i];
            j++;
            k++;
        }
        while (j<e){
            mixed[k]=arr[j];
            i++;
            k++;
        }
        for (int l = 0; l < mixed.length; l++) {
            mixed[s+l]=mixed[l];
            merge(mixed,i,j,e);

        }
    }
}


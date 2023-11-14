package SearchAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int target = s.nextInt();
        System.out.println(OAgnoBinSear(arr,target));
    }

    static int OAgnoBinSear(int[] arr, int target) {
        int s=0;
        int e=arr.length-1;

        boolean ascendingCheck= arr[s]<arr[e];
        while (s<=e){
        int mid=s-(s-e)/2;

        if (arr[mid] == target) {
            return mid;
        }

        else if (ascendingCheck){
            //ascending
            if (arr[mid] > target) {
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        else {
            //descending
            if (arr[mid] > target) {
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }
        }
    return -1;
    }

}
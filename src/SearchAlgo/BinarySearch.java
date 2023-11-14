package SearchAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int target=s.nextInt();
        System.out.println(BinarySear(arr,target));

    }
    static int BinarySear(int[] arr,int target){
        int s,e;
        s=0;
        e= arr.length-1;
        while(s<=e){
            int mid=s-(s-e)/2;
            if (arr[mid] == target) {
//                System.out.println("element found at: ");
                return mid;
            } else if (arr[mid]>target) {
                e=mid-1;
            }else {
                s=mid+1;
            }

        }return -1;

    }
}

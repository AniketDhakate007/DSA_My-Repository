package SearchAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
//    public static void main(String[] args) {
//        int arr[] = {12, 22, 43, 5, 13, 23};
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter number that you would like to search: ");
//        int key=s.nextInt();
//        int ans=Search(arr,key);
//        if (ans>0){
//            System.out.println("Element found at index: "+ans);
//        }
//        else {
//            System.out.println("Element not found");
//        }
//    }
//    static int Search(int[] arr, int key) {
//        if (arr.length == 0) {
//            return -1;
//        }
//        for (int i = 0; i < arr.length; i++) {
//
//            int element = arr[i];
//            if (element == key) {
//                return i;
//            }
//        }
//        return -1;// -1 means number not found
//    }
//}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter elements of array one by one: ");

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter element you wanna search: ");
        int target=s.nextInt();

        Search(arr,target);
    }

    static void Search(int[] array,int key){
        if (array.length==0){
            System.out.println("array is empty");
        }
        for (int i=0; i< array.length; i++){
            if (array[i]==key){
                System.out.println("Element found at index: "+i);
            }
        }
        System.out.println("Element not found");


    }
}



























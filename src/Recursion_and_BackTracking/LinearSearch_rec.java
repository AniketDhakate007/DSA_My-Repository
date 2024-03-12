package Recursion_and_BackTracking;

import java.util.ArrayList;

public class LinearSearch_rec {
    public static void main(String[] args) {
        int [] array = {1,2,3,12,14,5,12,6,8,9,12,13};
//        System.out.println(linSearch_rec(array,11,0));
        findAll_Occrurances(array,12,0);
        System.out.println(list);
    }

    static boolean linSearch_rec(int[] arr,int key,int index){
        if (index==arr.length){
            return false;
        }

        return arr[index] == key || linSearch_rec(arr,key,index+1);
    }


    static ArrayList<Integer> list =new ArrayList<>();
    static void findAll_Occrurances(int[] arr, int key, int index){
        if (index==arr.length){
            return;
        }
        if (arr[index] == key){
            list.add(index);
        }
        findAll_Occrurances(arr,key,index+1);
    }
}


package Recursion_and_BackTracking;

public class LinearSearch_rec {
    public static void main(String[] args) {
        int [] array = {1,2,3,14,5,6,8,9,12,13};
        System.out.println(linSearch_rec(array,11,0));
    }

    static boolean linSearch_rec(int[] arr,int key,int index){
        if (index==arr.length){
            return false;
        }

        return arr[index] == key || linSearch_rec(arr,key,index+1);
    }
}

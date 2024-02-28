package questions;

public class Check_sorted {
    public static void main(String[] args) {
        int [] array = {1,2,3,14,5,6,8,9,12,13};
        System.out.println(check(array,0));
    }

    static boolean check(int[] arr, int x){
        if (x == arr.length-1){
            return true;
        }
        return arr[x]<arr[x+1] && check(arr,x+1);
    }
}

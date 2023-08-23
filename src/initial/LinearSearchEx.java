package initial;

public class LinearSearchEx {
    public static void main(String[] args) {
        int arr[] = {12, 22, 43, 5, 13, 23};
        int key=22;
        int ans=Search(arr,key);
        if (ans>0){
            System.out.println("Element found at index: "+ans);
        }
        else {
            System.out.println("Element not found");
        }



    }

    static int Search(int[] arr, int key) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {


            int element = arr[i];
            if (element == key) {
                return i;
            }

        }
        return -1;
    }
}
package initial;

public class TwoSum {
    public static void main(String[] args) {
    int [] arr={2,4,7,9,11};
        System.out.println(twoSumIndices(arr,9));
    }
    static int[] twoSumIndices(int[] arr,int target){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] +arr[j]== target) {
                   return new int [] {i,j};

                }
            }
        }
        return new int[] {-1,-1};
    }
}

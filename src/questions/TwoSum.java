package questions;

public class TwoSum {
    public static void main(String[] args) {
    int [] arr={2,4,7,9,11};
//        System.out.println(twoSumIndices(arr,9));
    }
    public int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] +nums[j]== target) {
                   return new int [] {i,j};

                }
            }
        }
        return new int[] {-1,-1};
    }
}

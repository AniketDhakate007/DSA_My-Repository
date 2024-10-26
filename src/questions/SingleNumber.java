package questions;
//https://leetcode.com/problems/single-number/description/?envType=problem-list-v2&envId=array
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int one =0;
        for (int j = 0; j < 1; j++) {
            one = nums[j];
            for(int i = j+1; i <= nums.length-1; i++){

                if(nums[i]==one){
                    one=nums[j+1];
                    break;
                }

            }

        }

        return one;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,3,3,1,6,7,6,7};
        int ans = singleNumber(arr);

    }
}


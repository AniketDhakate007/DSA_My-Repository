package questions;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class Q_26 {
    public static int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1; i<nums.length; i++){

            if(nums[i] != nums[i-1]){
                nums[j]=nums[i];
                j++;
            }

        }  return j ;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,4,5,6,8};
        int duplicate=removeDuplicates(arr);
        System.out.println(duplicate);
    }
}

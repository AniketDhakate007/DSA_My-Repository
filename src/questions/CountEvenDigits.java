package questions;

public class CountEvenDigits {
    public static void main(String[] args) {
        int[] nums={12,34,234,65,76,98};
        System.out.println(digits(4556));
        System.out.println(even(4556));
    }

    static Boolean even(int num){
        int numberOfDigits= digits(num);
        if (numberOfDigits%2==0){
            System.out.println("Even");
        }
        return false;
    }
    static int digits(int num){
         int count = 0;

         while (num>0) {
             count++;
             num = num / 10;

         }
         return count;
    }
    static int FindNumbers(int[] nums){
     int count =0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (even(num)){
                count++;
            }

        }
        return  count;
    }
}

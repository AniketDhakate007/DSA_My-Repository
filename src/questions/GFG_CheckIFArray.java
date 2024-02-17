package questions;
import java.util.Arrays;
//https://www.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1?page=1&difficulty=Basic&sortBy=submissions
public class GFG_CheckIFArray {
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < N; i++) {
            if (A[i]==B[i]){
                continue;
            }else {
                return false;
            }
        }


    return true;
    }
}

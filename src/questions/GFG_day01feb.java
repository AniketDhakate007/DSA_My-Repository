package questions;
import java.util.Arrays;
import java.util.List;

//https://www.geeksforgeeks.org/problems/pangram-checking-1587115620/1
public class GFG_day01feb {
    public static boolean checkPangram  (String s) {
        // your code here
       List<String> z=Arrays.asList("abcdef");
       return .containsAll(z);

//        for (int i = 0; i < str.length; i++) {
//            if (s.contains(str[i])){
//                 continue;
//                 return true;
//            }
//        }

        return false;
    }
}

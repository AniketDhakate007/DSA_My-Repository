package initial;
import java.util.Arrays;
public class Demo {


    //shadowing
 /*   static int a=4;

    public static void main(String[] args) {
        System.out.println(a);
        a=3;
        System.out.println(a);
         }*/

    /*    public static void main(String[] args) {
            String name = "Kunal";
            char target = 'u';
          System.out.println(search(name, target));

            System.out.println(Arrays.toString(name.toCharArray()));
        }


        static boolean search2(String str, char target) {
            if (str.length() == 0) {
                return false;
            }

            for (char ch : str.toCharArray()) {
                if (ch == target) {
                    return true;
                }
            }
            return false;
        }

        static boolean search(String str, char target) {
            if (str.length() == 0) {
                return false;
            }

            for (int i = 0; i < str.length(); i++) {
                if (target == str.charAt(i)) {
                    return true;
                }
            }
            return false;
        }
    }*/
  /*  public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;
        System.out.println(linearSearch(arr, target, 1, 4));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = start; index <= end; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;

   */
  /*  public static void main(String[] args) {
        f(5);
    }
    static void f(int n){
                                                //recursion
        if (n == 0) {

            return ;
        }
       System.out.println(n);
       f(n-1);
       System.out.println(n);

   */
    public static void main(String[] args) {
        System.out.println(digitsum(7));
    }
    static int digitsum(int n){
        if (n <= 9 && n>=0) {
            return n;
        }
        return digitsum(n/10)+digitsum(n%10);
    }
}



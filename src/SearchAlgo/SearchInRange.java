package SearchAlgo;
import java.util.Arrays;
import java.util.Scanner;
public class SearchInRange {
    public static void main(String[] args) {
        int [] array={12,13,54,34,24,35,7,28,21,8,42};

        System.out.println("type the element you want to search for within the specified range: ");
        Scanner s=new Scanner(System.in);

        int target=s.nextInt();
        System.out.println(search(array,target,1,6));//1 and  6 is the index range of an array
    }

    static int search(int[]array,int target,int start,int end){
        if (array.length==0){
            return -1;
        }
        for (int index=start; index<end; index++){
            int element=array[index];
            if (element==target){
                return index;
            }
        }
    return -1;//here -1 means target DNE in the array within specified range
    }
}

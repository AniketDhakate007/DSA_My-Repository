package questions;

import java.util.Scanner;

public class MissingNumInArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8,9,10};
        System.out.println(findMissing(arr));

    }

        static int  findMissing(int arr[]){
            for (int i = 0; i < 100; i++) {
                if (arr[i]!=i+1){
                    return i+1; //missing number
                }
            }
            return -1;

        }
    }

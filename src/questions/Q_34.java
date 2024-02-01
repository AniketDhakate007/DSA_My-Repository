package questions;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

import SearchAlgo.SearchInRange;

import java.util.Arrays;

public class Q_34 {
    public static void main(String[] args) {
        int[] a={1,2,4,3,6,6,7};
        int[] ans= searchRange(a,6);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=First(nums,target);
        ans[1]=Second(nums,target);
        return ans;
    }
    public static int First(int[] arr,int t){
        int s=0;
        int e=arr.length-1;
        int f=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==t){
                f= mid;
                e=mid-1;
            }
            else if(arr[mid]>t){
                e=mid-1;
            }
            else{
                s=mid+1;
            }

        }
        return f;
    }
    public static int Second(int[] arr,int t){
        int s=0;
        int e=arr.length-1;
        int l=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==t){
                l=mid;
                s=mid+1;

            }
            else if(arr[mid]>t){
                e=mid-1;
            }
            else{
                s=mid+1;
            }

        }
        return l;

    }
}


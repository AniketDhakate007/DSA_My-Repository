package questions;
//https://leetcode.com/problems/sqrtx/
public class Q_69 {
    public static int mySqrt(int x) {
        if(x<=1){
            return x;
        }
        int s=0;
        int e=(x/2)+1;
        int sqroot=0; int mid=0;

        while(s<=e){
            mid=(s+e)/2;
            if(mid*mid==x){
                return mid;
            }
            else if(mid*mid>x){
                e=mid-1;

            }
            else{
                s=mid+1;
                sqroot=mid;
            }
        }
        return sqroot;

    }

    public static void main(String[] args) {
        int a=mySqrt(5);
        System.out.println(a);

    }
}

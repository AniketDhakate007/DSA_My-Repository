package questions;
//https://leetcode.com/problems/powx-n/description/
public class Q50PowOfx {
    public double myPow(double x, int n) {
        //   double ans = 1;
        //     if (n < 0 ){
        //         n = -n;
        //         x = 1/x;
        //     }
        //     while (n!=0){
        //         if(n % 2 != 0){
        //             ans = ans * x;
        //         }
        //         x = x * x;
        //         n = n/2;
        //     }
        //     return ans;

        double ans = 1;
        if (n < 0 ){
            n = -n;
            x = 1/x;

            while( n != 0){
                ans = ans * x;
                n = n-1;
            }

        }
        else{
            while( n != 0){
                ans = ans * x;
                n = n-1;
            }

        }
        return ans;
    }

    public void main(String[] args) {
        double ans= myPow(2.00,10);
        System.out.println(ans);
    }
}

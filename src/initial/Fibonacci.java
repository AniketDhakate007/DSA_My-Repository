package initial;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int a,b;
        a=0; b=1;
        int i=2;

        while (i<=n){
            int temp=b;
            b = b + a;
            a = temp;
            i++;

        }
        System.out.println(b);
    }
}
package initial;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int rem,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number you would like to check: ");
        int n=s.nextInt();
        int temp;
        temp=n;
        while (n!=0){
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if (temp==sum){
            System.out.println("Palindrome Number !");
        }
        else {
            System.out.println("Not a Palindrome Number !");
        }
    }
}

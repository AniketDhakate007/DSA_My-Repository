package initial;

public class DigitSum {
    public static void main(String[] args) {
    System.out.println(digitsum(7));
}
    static int digitsum(int n){
        if (n <= 9 && n>=0) {
            return n;
        }
        return (n/10)+digitsum(n%10);
    }
}

package initial;
//public class Demo {


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
 /*   public static void main(String[] args) {
        System.out.println(digitsum(7));
    }
    static int digitsum(int n){
        if (n <= 9 && n>=0) {
            return n;
        }
        return digitsum(n/10)+digitsum(n%10);

  */
    /*public static void main(String[] args) {
        int[] arr={1,2,4,3,5,7,8,6};
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>arr[i+1]){
                System.out.println("unsorted");
            }
            else {
                System.out.println("sorted");
            }
        }
    }
}*/


//class Employee{
//    String name;
//    int id;                 //using Reference variable
//    long salary;
//    public static void main(String[] args){
//        Employee e1= new Employee();
//        e1.name="Raj";
//        e1.id=1201;
//        e1.salary= 45000;
//        Employee e2= new Employee();
//        e2.name="Ram";
//        e2.id=1202;
//        e2.salary= 48000;
//        System.out.println("E1 info : "+e1.name+" "+e1.id+" "+e1.salary);
//        System.out.println("E2 info : "+e2.name+" "+e2.id+" "+e2.salary);
//    }
//}
//class Animal{
//    String name;
//    String breed;
//    int age;
//    void method(String c,String b, int a){
//        name=c;
//        breed=b;
//        age=a;
//    }
//    void display(){
//        System.out.println(name +" "+breed+" "+age);
//    }
//    public static void main(String[] args) {
//        Animal dog=new Animal();
//        dog.method("Bruno","golden R",4);
//        dog.display();
//    }
//}
//
//class Default{
//    int i;
//    String s;
//          public static void main(String[] args) {
//              Default d= new Default();
//              System.out.println(d.i+" "+d.s);
//    }
//}
//class NoArgs{
//    int a;
//    public NoArgs(){
//        System.out.println("No Argument Constructor");
//    }
//    public static void main(String[] args) {
//            NoArgs n=new NoArgs();
//    }
//}
//class Parameterised {
//    int a;
//
//    public Parameterised(int a) {
//        System.out.println("This is Parameterised Constructor with value: " + a);
//    }
//
//    public static void main(String[] args) {
//        Parameterised p = new Parameterised(10);
//    }
//}

import javax.sound.midi.Soundbank;
//import java.util.Scanner;
import java.util.SortedMap;

//OOP Pr.3
//class EvenOrOdd{
//    public static void main(String[] args) {
//        int a;
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter ANY Number TO CHECK: ");
//        a=s.nextInt();
//
//        if (a%2==0 && a!=0){
//            System.out.println("Even");
//        }
//        else if (a==0){
//            System.out.println("Neither even nor odd");
//        }
//        else {
//            System.out.println("Odd");
//        }
//    }
//}



import java.util.Scanner;
class MiniCalc{
    public static void main(String[] args) {
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any two numbers to calculate: ");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("Enter operator(+ , - , * , / , %) : ");
        char ch=s.next().charAt(0);
        switch (ch){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}

class Table{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=s.nextInt();

        for (int i = 1; i <=10 ; i++) {
            int x=n*i;
            System.out.println(x);

        }
    }
}
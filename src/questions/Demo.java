package questions;
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

//import java.util.Scanner;

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



//import java.util.Scanner;
//class MiniCalc{
//    public static void main(String[] args) {
//        int a,b;
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter any two numbers to calculate: ");
//        a=s.nextInt();
//        b=s.nextInt();
//        System.out.println("Enter operator(+ , - , * , / , %) : ");
//        char ch=s.next().charAt(0);
//        switch (ch){
//            case '+':
//                System.out.println(a+b);
//                break;
//            case '-':
//                System.out.println(a-b);
//                break;
//            case '*':
//                System.out.println(a*b);
//                break;
//            case '/':
//                System.out.println(a/b);
//                break;
//            case '%':
//                System.out.println(a%b);
//                break;
//            default:
//                System.out.println("Invalid operator!");
//                break;
//        }
//    }
//}
//
//class Table{
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter any number: ");
//        int n=s.nextInt();
//
//        for (int i = 1; i <=10 ; i++) {
//            int x=n*i;
//            System.out.println(x);
//
//        }
//    }
//}
//import java.util.*;
//class LinearSearch{
//    public static void main(String[] args) {
//
//        int[] arr={2,3,7,9,4,1,11};
//        System.out.println(Arrays.toString(arr));
//        System.out.print("Enter the target element you wanna search for: ");
//
//        Scanner s=new Scanner(System.in);
//        int target=s.nextInt();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                System.out.println("element found at index: "+i);
//            }
//        }
//        System.out.println("Element not found");
//    }
//}

//class Test{
//    public static void main(String[] args) {
//        int[][] arr=new int[3][];
//        arr[0]=new int[1];
//        arr[1]=new int[2];
//        arr[2]=new int[3];
//        int sum=0;
//        for (int i = 0; i < 3; ++i) {
//            for (int j = 0; j < i+1; ++j) {
//                arr[i][j]=j+1;
//
//
//            }
//
//        }
//        for (int i = 0; i < 3; ++i) {
//            for (int j = 0; j < i+1; ++j) {
//                sum+=arr[i][j];
//
//
//            }
//
//
//        }
//        System.out.println(sum);
//    }
//}

//class OneDimensionalArrays{
//    public static void main(String[] args) {
//        int[] arr = new int[5];
//        arr[0]=1;
//        arr[1]=3;
//        arr[2]=6;
//        arr[3]=7;
//        arr[4]=8;
//
//        System.out.println(Arrays.toString(arr));
//    }
//}

//class Sort{
//    public static void main(String[] args) {
//        int[] arr={1,4,6,5,2};
//        System.out.println("Unsorted Array: "+Arrays.toString(arr));
//        //bubble sort
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < arr.length-i; j++) {
//                if (arr[j] < arr[j-1]) {
//                    int temp=arr[j];
//                    arr[j]=arr[j-1];
//                    arr[j-1]=temp;
//                }
//            }
//        }
//        System.out.println("Sorted Array: "+Arrays.toString(arr));
//    }
//}

//class D{
//    public static void main(String[] args) {
//        int arr[][] = new int[3][];                   arr[0] = new int[1];
//        arr[1] = new int[2];                   arr[2] = new int[3];
//        int sum = 0;
//        for (int i = 0; i < 3; ++i)
//            for (int j = 0; j < i + 1; ++j)                              arr[i][j] = j + 1;
//        for (int i = 0; i < 3; ++i)
//            for (int j = 0; j < i + 1; ++j)                    sum += arr[i][j];
//        System.out.print(sum);
//    }
//}


class Add2Dmatrices{
    public static void main(String[] args) {
        int [][] matrix1={{1,3},
                          {5,7} };         //2X2 matrices
        int [][] matrix2={{2,4},
                          {6,9} };
//        int p,q,r,s;
        int [][] resultantMatrix = new int[2][2];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                resultantMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
                System.out.print(resultantMatrix[i][j]+",");
            }
            System.out.println();
        }

    }
}

class CmdLineArgs {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);

        int sum=a+b;
        System.out.println("The sum of given two numbers is : "+sum);
    }
}

class Factorial{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int factorial=1;

        for (int i = 1; i <= n; i++) {
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}

class Fibo{
    public static void main(String[] args) {
        int fibo1=0;
        int fibo2=1;
        System.out.print(fibo1+","+fibo2+",");

        int n=Integer.parseInt(args[0]);

        for (int i = 2; i < n; i++) {
            int fibo=fibo1+fibo2;
            System.out.print(fibo+",");
            fibo1=fibo2;
            fibo2=fibo;
        }
    }
}

































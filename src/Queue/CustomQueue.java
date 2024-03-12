package Queue;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomQueue {
    static ArrayList<Integer> queue = new ArrayList<>();
    static int front = -1;
    static int rear = -1;
    static void enqueue(){
        int e;
        System.out.println("Enter the number you wanna insert in a queue:\t");
        Scanner s = new Scanner(System.in);
        e = s.nextInt();

        if (front==-1 && rear==-1){
            front=rear=0;
            queue.add(e);
        }
        else {
            rear++;
            queue.add(e);
        }

    }
    static void display(){

    }

    public static void main(String[] args) {
        enqueue();
    }
}

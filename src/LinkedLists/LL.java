package LinkedLists;

import java.util.List;

public class LL {
    private Node head;
    private  Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
    }

    public void display(){
        Node temp=head;
        while (temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void insertLast(int value){
        if (tail==null){
            insertFirst(value);
            return;
        }
        Node node =new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    public  void insert(int val, int positn){
        if (positn==0){
            insertFirst(val);
            return;
        }
        if (positn==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < positn; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL linked = new LL();
        linked.insertFirst(3);
        linked.insertFirst(8);
        linked.insertFirst(6);
        linked.insertFirst(11);
        linked.insertFirst(12);
        linked.insertFirst(21);
        linked.insertLast(2);
        linked.display();
        linked.insert(23,5);

        linked.display();
    }


}

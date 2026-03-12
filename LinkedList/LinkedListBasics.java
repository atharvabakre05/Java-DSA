import java.util.*;
public class LinkedListBasics{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
        this.data  = data;
        this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    
    public void addFirst(int data){
        //step 1 create new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2 newNode next = head
        newNode.next = head;

        //step 3 - head = newNode 
        head = newNode;
    }

    public void addLast(int data){
        //step 1 Create a new Node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2 Link
        tail.next = newNode;

        //Change the tail 
        tail = newNode;
    }

    public void print(){    //O(n)
        // if(head == null){
        //     System.out.println("LL is empty");
        // }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    

    public static void main(String[] args){
        LinkedListBasics ll = new LinkedListBasics();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();

    }
    
}
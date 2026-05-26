import java.util.*;
public class LLRevision {
    //How a node is created!
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args){
        Node head = new Node(10);
        Node second = new Node(20);

        //Linking of nodes
        head.next = second;

        System.out.println(head.data);
        System.out.println(second.data);
    }
}

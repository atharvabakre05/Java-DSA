import java.util.*;
public class LLRevision {
    //Creating a node
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
    public static int size ;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if()

    }

    public static void main(String[] args){
        //CReation and implementation of one single Node in LL
        Node head = new Node(10);
        Node second = new Node(20);
        //Linking of nodes
        head.next = second;
        System.out.println(head.data);
        System.out.println(second.data);

        //AddFirst and AddLast 

    }
}

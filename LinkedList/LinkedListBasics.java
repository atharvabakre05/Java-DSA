import java.util.*;
public class LinkedListBasics{  
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

    //Methods add, remove, print, search
    public void addFirst(int data){
        //step 1 = create newNode
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2 = set newNode next value to the previous node's head
        newNode.next = head;
        //step 3 = set newNode as head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode; 
        tail = newNode;
    }

    public void print(){//O(n)
        Node temp = head;
        if(head == null){
            System.out.println("LL is empty");
            return;

        }
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = tail.data;       //tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itSearch(int key){   //O(n)
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }

        //key not found
        return -1;
    }



    public static void main(String[] args){
        LinkedListBasics ll = new LinkedListBasics();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();     //1->2->3->4->5->null
        // System.out.println(size);

        System.out.println(ll.itSearch(2));
        System.out.println(ll.itSearch(7));
        
    }
}
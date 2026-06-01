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
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
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

    public void printLL(){
        Node temp = head;
        if(head == null){
            System.out.println("LL is empty");
        }
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public void add(int idx, int data){
        Node newNode = new Node(data);
        size++;
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            System.out.println("The node's value which is removed is: "+ val);
        }
        int val = head.data;
        head = head.next;
        size--;
        System.out.println("The node's value which is removed is: "+ val);
    }

    public void removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            System.out.println("The node's value which is removed is: "+ val);
        }

        Node prev = head;
        int i = 0;
        while(i<size-2){
            prev = prev.next;
            i++;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        System.out.println("The node's value which is removed is: "+ val);
    }

    public int itSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n){
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next;   //removeFirst
            return;
        }

        //sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    
    public static void main(String[] args){
        LLRevision ll = new LLRevision();
        ll.addFirst(40);
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.addLast(50);
        ll.addLast(101);
        ll.add(2, 25);
        ll.printLL();
        // ll.removeFirst();
        // ll.removeLast();
        // ll.reverse();
        // ll.printLL();
        ll.deleteNthfromEnd(3);
        ll.printLL();
        // System.out.println(ll.itSearch(25));
        // System.out.println("The size of LL is: "+ ll.size); 
    }
}

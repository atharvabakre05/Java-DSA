import java.util.*;

public class ZigZag {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Methods add, remove, print, search
    public void addFirst(int data) {
        // step 1 = create newNode
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 = set newNode next value to the previous node's head
        newNode.next = head;
        // step 3 = set newNode as head;
        head = newNode;
    }

    public void print() {// O(n)
        Node temp = head;
        if (head == null) {
            System.out.println("LL is empty");
            return;

        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }   

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;    //Mid
    }

    public void zigZag(){
        //find mid
        Node midNode = findMid(head);

        Node rightHead = midNode.next;
        midNode.next = null;
        //reverse second half
        Node curr = rightHead;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //alternate merge -zig-zag merge
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;

        }
    }

    public static void main(String[] args){
        ZigZag ll = new ZigZag();

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();
        ll.zigZag();
        ll.print();


    }
}

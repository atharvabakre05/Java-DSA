import java.util.*;

public class mergeSort {
    public static class Node {
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

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // MidNode
    }

    public Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node MergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find midNode
        Node midNode = getMid(head);

        // divide the Linked list in two halves
        Node rightHead = midNode.next;
        midNode.next = null;
        Node newLeft = MergeSort(head);
        Node newRight = MergeSort(rightHead);

        // merge the both halves
        return merge(newLeft, newRight);
    }

    public static void main(String[] args){
        mergeSort ll = new mergeSort();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        head = ll.MergeSort(head);
        ll.print();
    }
}

import java.util.*;
public class LLPart2 {
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
    
    

    public static boolean isCycle(){    //Floyd's Cycle finding Algorithm
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    

    public static void main(String[] args){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(5);

        //LL: 1->2->3->1
        System.out.println(isCycle());
        
    }
}

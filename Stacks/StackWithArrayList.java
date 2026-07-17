import java.util.*;
public class StackWithArrayList{
    public static ArrayList<Integer> list = new ArrayList<>();

    public static void push(int data){
        list.add(data);
    }

    public static int pop(){
        if(list.isEmpty()){
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    public static int peek(){
        if(list.isEmpty()){
            return -1;
        }
        int top = list.get(list.size()-1);
        return top;
    }

    public static void printAL(){
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
    }
    public static void main(String[] args){
        // Stack<Integer> s = new Stack<>();
        StackWithArrayList obj = new StackWithArrayList();
        push(3);
        push(2);
        push(1);
        System.out.println(pop());
        System.out.println(peek());
    }
}
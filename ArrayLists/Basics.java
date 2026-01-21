import java.util.*;
    public class Basics{
        public static void main(String[] args) {
            ArrayList <Integer> list = new ArrayList<>();
            ArrayList <String> list2= new ArrayList<>();
            ArrayList <Boolean> list3 = new ArrayList<>();
            

            //Add Function O(1)
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

            list.add(2,99); //O(n)
            System.out.println(list);

            //Get Function O(1)
            // int element = list.get(0);
            // System.out.println(element);

            //Remove Function O(n)
            // list.remove(1);
            // System.out.println(list);

            //Set element at particular index O(n)
            // list.set(2,10);
            // System.out.println(list);

            //Used to check whether the list contains element O(n)
            // System.out.println(list.contains(1));
            // System.out.println(list.contains(11));
        }
    }
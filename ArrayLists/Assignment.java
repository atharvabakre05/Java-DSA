import java.util.*;
public class Assignment {
    //Q1
    public static boolean Monotonic(ArrayList<Integer>list){
        boolean inc = true;
        boolean dec = true;
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)>list.get(i+1)){
                inc = false;
            }
            if(list.get(i)<list.get(i+1)){
                dec = false;
            }
        }
        return inc || dec;

    }


    //Q2
    public static ArrayList<Integer>LoneNumbers(ArrayList<Integer>list){
        

    }

    //Q3
    

    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        // System.out.println(Monotonic(list));

        System.out.println(LoneNumbers(list));
    }
}


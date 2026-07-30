import java.util.*;
public class basics {
    public static void main(String[] args){
        //Initialization of HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert - O(1)
        hm.put("India", 100);
        hm.put("USA", 150);
        hm.put("Australia", 200);

        System.out.println(hm);
    }
}

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

        //Size 
        System.out.println("The size of HashMap is: "+ hm.size());

        // //Is Empty
        // hm.clear();
        // System.out.println(hm.isEmpty());

        // //Get - O(1)
        // System.out.println(hm.get("Indonesia"));

        // //ContainsKey - O(1)
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Indiaa"));

        // //Remove O(1)
        // System.out.println(hm.remove("Australia"));
        // System.out.println(hm);

        //Iterate HashMap elements
        Set<String> keys = hm.keySet();
        for(String k : keys){
            System.out.println("key=" + k + ", value="+ hm.get(k));
        }

        
    }
}

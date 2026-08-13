import java.util.*;
public class TypesOfHashMap {
    public static void main(String[] args){

        //LinkedHashMap
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 150);
        lhm.put("USA", 100);
        lhm.put("Germany", 50);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 150);
        hm.put("USA", 100);
        hm.put("Germany", 50);

        //TreeMap
        TreeMap<String, Integer> thm = new TreeMap<>();
        thm.put("India", 150);
        thm.put("USA", 100);
        thm.put("Germany", 50);

        System.out.println(hm);
        System.out.println(lhm);
        System.out.println(thm);        

    }
}

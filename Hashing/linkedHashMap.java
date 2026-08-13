import java.util.*;
public class linkedHashMap {
    public static void main(String[] args){
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 150);
        lhm.put("USA", 100);
        lhm.put("Germany", 50);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 150);
        hm.put("USA", 100);
        hm.put("Germany", 50);

        System.out.println(lhm);
        System.out.println(hm);

    }
}

package hashmap.BaseQuse;

import java.util.HashMap;
import java.util.Set;

public class HashMap02 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("INdonesia", 6);
        hm.put("Nepal", 5);


        //Iterate
        Set<String> keys = hm.keySet();

        System.out.println(keys);

        for (String k : keys) {
                System.out.println("key="+k+" , "+ "value="+" "+hm.get(k));
        }
    }
}

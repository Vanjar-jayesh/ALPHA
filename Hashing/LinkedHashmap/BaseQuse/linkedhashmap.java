package LinkedHashmap.BaseQuse;

import java.util.*;

public class linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>lhm = new LinkedHashMap<>();

        lhm.put("India", 100);
        lhm.put("china", 150);
        lhm.put("US", 50);
        
        System.out.println(lhm);


        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("china", 150);
        hm.put("US", 50);
        
        System.out.println(hm);
    }
}

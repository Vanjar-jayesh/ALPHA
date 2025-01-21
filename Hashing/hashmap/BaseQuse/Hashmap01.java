package hashmap.BaseQuse;

import java.net.Socket;
import java.util.HashMap;

public class Hashmap01 {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // get
        // int population = hm.get("India");

        // System.out.println(population);

        // System.out.println(hm.get("indos"));

        // //containskey-0(1)

        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("indos"));

        // remove - 0(1)
        // System.out.println(hm.remove("India"));
        // System.out.println(hm);

        //size
        System.out.println(hm.size());

        //Is empty
        System.out.println(hm.isEmpty());
    }
}
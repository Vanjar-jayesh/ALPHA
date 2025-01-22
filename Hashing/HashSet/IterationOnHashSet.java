package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("delhi");
        cities.add("mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities);

       // Iterator it = cities.iterator(); 
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // for(String city: cities){
        //     System.out.println(city);
        // }

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs);

     
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");

        System.out.println(ts);
    }
}

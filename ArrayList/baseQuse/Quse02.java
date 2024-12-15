
package baseQuse;
import java.util.*;
;

public class Quse02 {
    public static void main(String[] args) {
               ArrayList<Integer> al = new ArrayList<>();

        al.add(2);
        al.add(5);
        al.add(9);
        al.add(3);
        al.add(6);

        System.out.println(al);
        Collections.sort(al); // ascending
        System.out.println(al);

        //descending
        Collections.sort(al,Collections.reverseOrder());

        System.out.println(al);
    }
}

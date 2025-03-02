


package printsum_1;

import java.util.ArrayList;

public class Quse02 {
    public static boolean prirSum(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;


        
        
        // int sum = lp + rp;

        // while (lp < rp) { // lp != rp  2and condation

        //     if (sum == target) {
        //         return true;
        //     }

        //     else if (sum < target) {
        //         lp++;
        //     }

        //     else if (sum == target) {
        //         rp--;
        //     }
        // }

        

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        System.out.println(prirSum(list, target));
    }
}

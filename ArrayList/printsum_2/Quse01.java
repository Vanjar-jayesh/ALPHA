package printsum_2;

import java.util.ArrayList;

public class Quse01 {
    public static boolean printsum(ArrayList<Integer> list,int target){
        // int lp = 0;
        // int rp = list.size()-1;
        int n= list.size();

        // while (lp != rp) {
        //     if (list.get(lp) + list.get(rp) == target) {
        //         return true;
        //     }

        //     if (list.get(lp)+ list.get(rp) < target) {
        //         lp = (rp+1)%n;
        //        // lp++;
        //     }else{
        //         rp = (n+rp-1)%n;
        //        // rp--;
        //     }
        // }

        int bp = -1;
        for(int i=0; i<list.size(); i++){
            if (list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }

        int lp  = bp+1;
        int rp = bp ;

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                 return true;
            }

              if (list.get(lp)+ list.get(rp) < target) {
                     lp = (rp+1)%n;
               // lp++;
            }else{
                rp = (n+rp-1)%n;
               // rp--;
            }

           
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(printsum(list, target));
    }
}

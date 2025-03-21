

package Array;

import java.util.HashSet;

public class GivenanintegerarraunumsreturnTF {

    public static boolean cotaindupleicate(int[] num){
        // for(int i=0; i<num.length-1;i++){
        //     for(int j = i; j<num.length; j++){
        //         if (num[i] == num[j]) {

        //             return true;
        //         }
        //     }
        // }
        // return false;


        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<num.length; i++){
            if (set.contains(num[i])) {
                return true;
            }else{
                set.add(num[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num[] = {1,2,3,1};
        
        
        System.out.println(cotaindupleicate(num));


    }
}

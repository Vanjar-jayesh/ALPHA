package practiceQuse;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quse02 {
        public static void findlonely(ArrayList<Integer> nums){

            Collections.sort(nums);

            ArrayList<Integer> list = new ArrayList<>();
          //  List<Integer> list2 = new List<Integer>();
                
          

            for(int i=1; i<nums.size()-1; i++){
                if (nums.get(i-1) + 1 <nums.get(i) && nums.get(i) + 1 <nums.get(i+1)) {
                    list.add(nums.get(i));
                }
            }

            if (nums.size() == 1) {
                list.add(nums.get(0));
            }

            if (nums.size()>1) {
                if (nums.get(0) + 1 < nums.get(1))  {
                    list.add(nums.get(0));
                }
                if (nums.get(nums.size() - 2) + 1<nums.get(nums.size()-1)) {
                    list.add(nums.get(nums.size()-1));
                }
            }

            System.out.println(list);
        }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);

        int arr[] = { 1,2,3,4};

        //arr.length

          findlonely(nums);

        //System.out.println(findlonely(nums));

    }
}

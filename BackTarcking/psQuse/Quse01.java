package psQuse;
public class Quse01 {
    public static int majortyelmenet(int nums[]){
            int n = nums.length;
        for(int i = 0; i<nums.length; i++){
          int count = 0; 

          for(int j =0; j<n; j++){
            if (nums[i] == nums[j]) {
                count++;
            }
          }

          if (count > n/ 2) {
            return nums[i];
          }
        }

        return n;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
      // int nums[] = {3,2,3};

        System.out.println(majortyelmenet(nums));
    }
}

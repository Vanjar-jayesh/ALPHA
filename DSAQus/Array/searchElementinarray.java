package Array;

public class searchElementinarray {

    public static int search(int [] nums,int target){
        int min = minserch(nums);

        if (nums[min] <= target && target <=nums[nums.length-1]) {
            return search1(nums,min,nums.length-1,target);
        }
        else{
            return search1(nums,0,min,target);
            
        }
    }

    public static int search1(int [] nums,int left,int right,int target){
        int l = left; 
        int r = right;

        while (l<=r) {

            int mid = l + (r-l)/2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                r = mid-1;
            }
            else{
                l = mid+1;
            }
            
        }
        return -1;
    }

    public static int minserch(int [] num){
        int left = 0;
        int right = num.length-1;
        while (left<right) {
            int mid = left + (right-left)/2;
            if (mid>0 && num[mid-1] > num[mid]) {
                return mid;
            }
            else if (num[left] <= num[mid] && num[mid] > num[right]) {
                left = mid +1;

            }else{
                right = mid-1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        
        int num [] = {4,5,6,7,1,2};
        int target = 0;

        System.out.println(search(num, target));
    }
}

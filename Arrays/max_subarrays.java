public class max_subarrays {
    public static void MaxsubarraysSum(int number[]) {
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;

        
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currSum=0;
                for (int k = start; k <= end; k++) {
                    currSum += number[k];
                    // System.out.print(number[k] + " ");

                }
                System.out.println(currSum);
                if (maxsum<currSum) {
                    maxsum = currSum;
                }
                
            }
            System.out.println();

        }
        System.out.println("Max sum="+maxsum);
       
    }

    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};

        MaxsubarraysSum(number);    
       
    }
}

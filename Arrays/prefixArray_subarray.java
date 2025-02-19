public class prefixArray_subarray {
    public static void MaxsubarraysSum(int number[]) {
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        // claculate prefix array
        prefix[0] = number[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxsum < currSum) {
                    maxsum = currSum;
                }

            }
        }
        System.out.print("Max sum=" + maxsum);

    }

    public static void kadanes(int number[]){
        int ms = Integer.MIN_VALUE;
        int cs =0;

        for(int i=0; i<number.length; i++){
            cs = cs+number[i];
            if (cs<0) {
                cs=0;
            }
            ms = Math.max(cs, ms);

        }

        System.out.println("Our max subarray sum is:"+ms);
    }

    public static void main(String[] args) {
        int number[] = {-2,-3,4,-1,-2,1,5,-3};

     kadanes(number);

    }
}

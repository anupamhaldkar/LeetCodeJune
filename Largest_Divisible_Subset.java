class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        if(nums.length == 0){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        int length = nums.length;
        int[] c = new int[length];
        int[] dp = new int[length];
        Arrays.fill(c, 1);
        int max = 0;
        for (int i = 1; i < length; i++) {
            int f = nums[i];
            for (int j = 0; j < i; j++) {
                if (f%nums[j] == 0) {
                    if(c[i] < c[j]+1){
                        dp[i] = j;
                        c[i] = c[j]+1;
                    }
                }
            }
            if(c[i] > c[max]){
                max = i;
            }
        }
        List<Integer> r = new ArrayList<>();
        int k =max;
        for (int i = c[max]; i > 0; i--) {
            r.add(nums[k]);
            k = dp[k];
        }
        return r;
    
    }
}

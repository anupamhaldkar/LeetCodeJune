class Solution {
int[] w_s;
    public Solution(int[] w) {
           
     w_s = new int[w.length];
        int sum = 0;
        for(int i = 0; i < w.length; i++){
            sum += w[i];
            w_s[i] = sum;
        }
    }
    
    public int pickIndex() {
        double target = w_sum[w_sum.length - 1] * Math.random();
        for(int i = 0; i < w_sum.length; i++){
            if(target < w_sum[i]) return i;
        }
        return -1;
    }
}

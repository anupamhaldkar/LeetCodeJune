class Solution {
    public int findDuplicate(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            
            int absI = Math.abs(nums[i]);
            if (nums[absI]<0) {
                return Math.abs(nums[i]);
            }
            nums[absI] = -1*nums[absI];
        }
        return -1;
    }
}
Comment

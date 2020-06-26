class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i, length = nums.length, result=0;
        for(i=0;i<length;){
            if(i==length-1){
                result = nums[i];
                break;
            }
            else if(nums[i] == nums[i+1] && i+3<=length){
                i+=3;
            }
            else{
                result = nums[i];
                break;
            }
        }
        return result;
    }
}

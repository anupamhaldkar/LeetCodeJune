class Solution {
    public void sortColors(int[] nums) {
        int[] a =new int[3];
        for(int i=0;i<nums.length;i++)
            a[nums[i]]++;
        int k=0;
        for(int i=0;i<3;i++)
            for(int j=0;j<a[i];j++)
               nums[k++]=i;
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int max=0;
        int sum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
                max+=nums[i];
            if(max<nums[i]) max=nums[i];
            if(sum<max) sum=max;
        }
        return sum;
    }
}
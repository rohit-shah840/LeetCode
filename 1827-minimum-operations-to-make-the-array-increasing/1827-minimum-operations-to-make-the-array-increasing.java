class Solution {
    public int minOperations(int[] nums) {
        //if(nums.length==1) return 0;
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                sum+=nums[i]-nums[i+1]+1;
                nums[i+1]+=nums[i]-nums[i+1]+1;
            }
        }
        return sum;
    }
}
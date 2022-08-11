class Solution {
    public int maxProductDifference(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int t= nums[j];
                    nums[j]=nums[i];
                    nums[i]=t;
                }
            }
        }
        sum= (((nums[nums.length-1])* (nums[nums.length-2])) -(( nums[0])*(nums[1])));
        return sum;
    }
}
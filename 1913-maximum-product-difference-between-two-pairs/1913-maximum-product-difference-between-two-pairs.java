class Solution {
    public int maxProductDifference(int[] nums) {
        int sum=0;
        int l= nums.length;
       Arrays.sort(nums);
        sum= (((nums[l-1])* (nums[l-2])) -(( nums[0])*(nums[1])));
        return sum;
    }
}
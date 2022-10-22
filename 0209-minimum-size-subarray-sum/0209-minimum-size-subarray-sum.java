class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minCount = Integer.MAX_VALUE;
  int sum = 0; 
  int start = 0;
  int end = 0;
  while(end < nums.length){
     if(nums[end] >= target) return 1; // This will exit loop if a number greater than or equal to target is spotted. We need not iterate further in that case
     sum += nums[end++];
     while(sum >= target){
          minCount = Math.min(minCount, end-start);
          sum -= nums[start++];
      }
      }
    return minCount > nums.length ? 0: minCount;
    }
}
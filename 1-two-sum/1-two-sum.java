class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> n = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            int rem = target - nums[i];
            if(n.containsKey(rem)){
                return new int[]{n.get(rem),i};
            }
            n.put(nums[i],i);
        }
        return nums;
    }
}
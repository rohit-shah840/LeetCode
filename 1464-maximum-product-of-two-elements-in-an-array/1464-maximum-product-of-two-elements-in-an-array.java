class Solution {
    public int maxProduct(int[] nums) {
        // Arrays.sort(nums);
        // return ((nums[nums.length-2]-1)* (nums[nums.length-1]-1));
        int mx1 = Integer.MIN_VALUE, mx2 = mx1;
        for (int n : nums) {
            if (n > mx1) {
                mx2 = mx1;
                mx1 = n;
            }else if (n > mx2) {
                mx2 = n;
            }
        }
        return (mx1 - 1) * (mx2 - 1);
    }
}
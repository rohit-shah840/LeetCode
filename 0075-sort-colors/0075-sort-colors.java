class Solution {
    public void sortColors(int[] nums) {
        int j= 0, k= nums.length - 1, i = 0;
    while (i<= k) {
        if (nums[i] == 0) {
            nums[i] = nums[j];
            nums[j] = 0;
            j++;
        }
        if (nums[i] == 2) {
            nums[i] = nums[k];
            nums[k] = 2;
            k--;
            i--;
        }
        i++;
    }
    }
}
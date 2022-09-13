class Solution {
    public int maxArea(int[] h) {
        int max_area = 0;
        int left_index = 0;
        int right_index = h.length - 1;
        while (left_index < right_index) {
            int left_height = h[left_index];
            int right_height = h[right_index];
            int min_height = Math.min(left_height, right_height);
            max_area = Math.max(max_area, min_height * (right_index - left_index));
            if (left_height < right_height)
                left_index++;
            else
                right_index--;
        }
        return max_area;
    }
}
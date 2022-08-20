class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length -1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>=nums[j]){
                    int t= nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                arr.add(i);
            }
        }
        return arr;
    }
}
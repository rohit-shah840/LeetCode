class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res= nums[0]+nums[1]+nums[nums.length-1];
        for(int i=0;i<nums.length-2;i++){
            int start = i+1;
            int end = nums.length-1;
            while(start<end){
                int sum=  nums[i]+nums[start]+nums[end];
                if(Math.abs(target-sum)<Math.abs(target-res)){
                    res=sum;
                }else if(sum>target){
                    end--;
                }else{
                    start++;
                }
            }
        }
        return res;
    }
}
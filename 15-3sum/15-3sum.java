class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l =  new ArrayList<>();
       for(int i=0;i<nums.length-2;i++){
           if(i==0 || (i>0 && nums[i]!=nums[i-1])){
           int start=i+1;
           int end= nums.length-1;
           int sum=0-nums[i];
           
           while(start<end){
               if(nums[start]+nums[end]==sum){
                   l.add(Arrays.asList(nums[i],nums[start],nums[end]));
                   while(start < end && nums[start]==nums[start+1]) start++;
                   while(start < end && nums[end]==nums[end-1]) end--;
                   start++;
                   end--;
               }else if(nums[start]+nums[end]>sum){
                   end--;
               }else{
                   start++;
               }
           }
       }
       }
        return l;
    }
}
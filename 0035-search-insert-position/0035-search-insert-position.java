class Solution {
    public int searchInsert(int[] nums, int target) {
        //int i;
        //TC = O(n)
        // for(i=0;i<nums.length;i++){
        //     if(target<=nums[i]){
        //         return i;
        //     }
        // }
        int l=0;
        int h=nums.length -1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(nums[mid]==target)return mid;
               if(nums[mid]>target){
                   h=mid-1;
               } else{
                   l=mid+1;
               }
        }
         return l;
    }
}
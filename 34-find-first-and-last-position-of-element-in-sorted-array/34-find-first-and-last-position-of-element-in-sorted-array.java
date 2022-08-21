class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] arr =new int [2];
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                c++;
                if(c==1)
               arr[0]=i;
                if(c>1 && nums[i]==target)
                    arr[1]=i;
            }
        }
        if(c==0){
            arr[0]=-1;
            arr[1]=-1;
        }else if(c==1){
            arr[1]=arr[0];
        }
        return arr;
    }
}
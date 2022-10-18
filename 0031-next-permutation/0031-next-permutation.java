class Solution {
    
    public void nextPermutation(int[] nums) {
        int n= nums.length;
        int k=n-2;
        //base case
        if(nums==null  || nums.length<=1)return ;
        //for finding the k value
        for(int i=n-1;i>0;i--){
            if(nums[i]<=nums[i-1]) {k--;}
            else{ break;}
        }
        if(k==-1){
            reverse(nums,0,n-1);
            return ;
        }
        //replace k with greater value
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[k]){
                swap(nums,k,i);
                break;
            }
        }
        reverse(nums,k+1,n-1);
    }
    void swap(int []nums,int s,int e){
        int t=nums[s];
        nums[s]=nums[e];
        nums[e]=t;
    }
    void reverse(int []nums,int s, int e){
        while(s<e){
            int t= nums[s];
            nums[s]=nums[e];
            nums[e]=t;
            s++;
            e--;
        }
    }
}
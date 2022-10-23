class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]=new int[2];
        int n=nums.length;
        int sum=(n*(n+1)/2);
        int sum1=0;
        for(int i=0;i<n;i++)sum1+=nums[i];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    arr[0]=nums[i];
                    arr[1]=Math.abs(sum-(sum1-nums[i]));
                }
            }
        }
        return arr;
    }
}
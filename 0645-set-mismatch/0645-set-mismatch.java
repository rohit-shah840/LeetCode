class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]=new int[nums.length];
       int ans[]=  new int[2];
        for(int a : nums){
            arr[a-1]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                ans[0]=i+1;
            }
            if(arr[i]==0){
                ans[1]=i+1;
            }
        }
        return ans;
    }
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
    int[] res = new int[n];
    res[0] = 1;
    for (int i = 1; i < n; i++) {
        res[i] = res[i - 1] * nums[i - 1];
    }
    int right = 1;
    for (int i = n - 1; i >= 0; i--) {
        res[i] *= right;
        right *= nums[i];
    }
    return res;
        // int result[]= new int[nums.length];
        // int temp=1;
        // //for the left multiple array stored
        // for(int i=0;i<nums.length;i++){
        //     result[i]=temp;
        //     temp*=nums[i];
        //    // System.out.print(result[i]);
        // }
        // temp=1;
        // //for the right multiple array stored
        // for(int i=nums.length-1;i>=0;i--){
        //     result[i]*=temp;
        //     temp*=nums[i];
        // }
        // return result;
    }
}
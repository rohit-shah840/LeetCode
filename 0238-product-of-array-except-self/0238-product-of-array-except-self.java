class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[]= new int[nums.length];
        int temp=1;
        //for the left multiple array stored
        for(int i=0;i<nums.length;i++){
            result[i]=temp;
            temp*=nums[i];
            System.out.print(result[i]);
        }
        temp=1;
        //for the right multiple array stored
        for(int i=nums.length-1;i>=0;i--){
            result[i]*=temp;
            temp*=nums[i];
        }
        return result;
    }
}
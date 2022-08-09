class Solution {
    public int[] decompressRLElist(int[] nums) {
        int  sum=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0)
                sum+=nums[i];
        }
        
        int [] arr = new int [sum];
        
        int k=0;
        
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i];j++){
                arr[k]=nums[i+1];
                k++;
            }
            i++;
        }
        return arr;
    }
}
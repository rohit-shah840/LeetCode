class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int arr[] = new int [nums.length];
        for(int i=0;i<index.length;i++){
            if(i==index[i]){
                arr[i]=nums[i];
            }else{
                               
                for(int j=i;j>index[i];j--){
                     arr[j]=arr[j-1];
                }
                 arr[index[i]]=nums[i];
            }
        }
        return arr;
    }
}
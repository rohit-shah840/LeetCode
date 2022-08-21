class Solution {
    public int[] twoSum(int[] n, int target) {
         int start=0;
        int end= n.length-1;
        while(start<=end){
            int sum=n[start]+n[end];
            if(sum>target){
                end-=1;
            }else if(sum<target){
                start+=1;
            }else{
                return new int [] {start+1,end+1};
            }
        }
        return new int [] {start+1,end+1};
    }
}
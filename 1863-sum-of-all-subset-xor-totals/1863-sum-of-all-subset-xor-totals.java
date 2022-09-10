class Solution {
    public int subsetXORSum(int[] nums) {
int sum=0;
        //int n= (int)Math.pow(2,nums.length);
        for(int i=0;i<(1<<nums.length);++i){
            int x=0;
            for(int j=0;j<nums.length;++j){
                if((i & (1<<j))>0)
                    x=x^nums[j];
            }
             sum+=x;
        }
        return sum;
    }
}
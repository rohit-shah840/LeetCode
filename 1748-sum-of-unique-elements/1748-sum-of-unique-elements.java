class Solution {
    
    public int sumOfUnique(int[] nums) {
       int  sum=0;
        for(int i:nums){
           if( check(i,nums)){
               sum+=i;
           }
        }
        return sum;
    }
    boolean check(int n, int[]arr){
        int c=0;
        for(int i:arr){
            if(i==n){
                ++c;
            }
              if(c>1) return false;
        }
      
        return true;
    }
}
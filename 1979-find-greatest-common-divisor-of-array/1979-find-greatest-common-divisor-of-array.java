class Solution {
    public int findGCD(int[] nums) {
        int max=0;
        int min=1001;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]) 
                max=nums[i];
            if(min>nums[i]) 
                min= nums[i];
        }
        return gcd(min,max);
    }
    public int gcd(int min, int max){
        if(max==0) return min;
        return gcd(max,min%max);
    }
    
}
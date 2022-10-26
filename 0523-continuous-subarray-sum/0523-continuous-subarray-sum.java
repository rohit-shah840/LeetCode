class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length<=1)return false;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            System.out.print(sum+" ");
            if(k!=0) sum%=k;
           if(map.containsKey(sum)){
               if(i-map.get(sum)>1)return true;
           }else{
               map.put(sum,i);
               System.out.print(sum+" ");
           }
            System.out.print(sum+" ");
        }
        return false;
    }
}


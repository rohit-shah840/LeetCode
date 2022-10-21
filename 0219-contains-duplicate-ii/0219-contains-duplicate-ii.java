class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for( int i=0;i<nums.length;i++){
            int curr=nums[i];
            if(map.containsKey(curr) && i- map.get(curr) <=k)return true;
            else map.put(nums[i],i);
        }
        return false;
    }
}
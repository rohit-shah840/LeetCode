class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> arr = new HashSet<>();
        for(int i =0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    arr.add(nums2[j]);
                }
            }
        }
         List<Integer> list = new ArrayList<>(arr);
        int arr1 []= new int[list.size()];
        for(int i=0;i<list.size();i++)
            arr1[i]= list.get(i);
        
        return arr1;
    }
}
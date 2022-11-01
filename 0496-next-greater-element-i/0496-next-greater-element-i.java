class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]  = new int [nums2.length];
        int i=0;
        for( i=0;i<nums2.length-1;i++){
            for(int j=i+1;j<nums2.length;j++){
                if(nums2[i]<nums2[j]){
                    arr[i]=nums2[j];
                    break;
                }else{
                    arr[i]=-1;
                }
            }
        }
        arr[i]=-1;
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
        int res[] = new int [nums1.length];
        for(int j=0;j<nums1.length;j++){
        for( i=0;i<nums2.length;i++){
            if(nums1[j]==nums2[i]){
                res[j]=arr[i];
               // j++;
                break;
            }
        }
        }
         return res;
    }
}
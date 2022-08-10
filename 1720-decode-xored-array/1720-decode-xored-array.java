class Solution {
    public int[] decode(int[] encoded, int first) {
        int arr[]= new int [encoded.length +1];
        arr[0]=first;
        int j=1;
        for(int i=0;i<encoded.length;i++){
           arr[j]= arr[i] ^ encoded[i];
               j++;
        }
        return arr;
    }
}
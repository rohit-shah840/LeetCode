class Solution {
    public int largestAltitude(int[] gain) {
        int arr [] = new int[gain.length+1];
        int sum=0,max=0;
        arr[0]=0;
        int j=0;
        for(int i=1;i<arr.length;i++){
            sum+=gain[j];
            arr[i]=sum;
            j++;
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
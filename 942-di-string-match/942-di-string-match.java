class Solution {
    public int[] diStringMatch(String s) {
        int len= s.length();
        int start=0;
        int end=len;
        int arr[] = new int [len+1];
        int i;
        for(i=0;i<len;i++){
            if(s.charAt(i)=='I') arr[i]=start++;
            else arr[i]= end--;
        }
        arr[i]= start;
        return arr;
    }
}
class Solution {
    public int heightChecker(int[] heights) {
        int arr[] = new int [heights.length];
        for(int i=0;i<heights.length;i++)
            arr[i]=heights[i];
        
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<heights.length;i++){
            //System.out.print(arr[i]+" ");
          //  System.out.print(heights[i]+" ");
            if(arr[i]!=heights[i])
                c++;
        }
        return c;
    }
}
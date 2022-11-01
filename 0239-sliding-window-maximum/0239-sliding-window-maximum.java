class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //for the index
        int ngeArr []= nextGreaterElement(nums);
        
        int arr[]= new int[nums.length-k+1];
        for(int i=0;i<=nums.length-k;i++){
            int  j=i;
            while(ngeArr[j]<i+k){
                j=ngeArr[j];
            }
            arr[i]=nums[j];
        }
        return arr;
    }
    public int[] nextGreaterElement(int []a){
        int res[]= new int[a.length];
        Stack<Integer> stack= new Stack<>();
        
        for(int i=a.length-1;i>=0;i--){
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && a[stack.peek()]<=a[i]){
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                res[i]=a.length;
            }else{
                res[i]=stack.peek();
            }
            stack.push(i);
        }
        return res;
    }
}
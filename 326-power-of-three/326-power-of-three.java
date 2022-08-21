class Solution {
    public boolean isPowerOfThree(int n) {
        int x=n;
        if(x==0) return false;
        while(n%3==0){
            //System.out.print(n+" ");
            n/=3;
           // System.out.print(n+" ");
        }
       //  System.out.print(n+" ");
        if(n==0 || n==1){
            return true;
        }
     return false;
    }
}
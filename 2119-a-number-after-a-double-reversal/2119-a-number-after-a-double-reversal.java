class Solution {
    public boolean isSameAfterReversals(int num) {
        int n=num;
        int sum=0;
        while(n!=0){
            int r= n%10;
            sum=sum*10+r;
            n/=10;
        }
        int x=sum;
         sum=0;
        while(x!=0){
            int r= x%10;
            sum=sum*10+r;
            x/=10;
        }
            if(num==sum)return true;
        return false;
    }
}
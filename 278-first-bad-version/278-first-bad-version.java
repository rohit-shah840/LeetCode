/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       long  l= 1;
        long r= n;
        long  mid;
        long result=n;
        while(l<=r){
            mid=(l+r)/2;
            if(isBadVersion((int)mid)){
                result=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return (int)result;
    }
}
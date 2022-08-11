class Solution {
    public int maximum69Number (int num) {
        int n=num;
        int n1=num;
        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }
        
          int l = -1;
        for (int i = count - 1; i >= 0; i--) {
            int y = (int) Math.pow(10, i);
            int x = n / y;
            if (x == 9) {
                n -= (9 * y);
                continue;
            } else {
                l = i;
                break;
            }

        }
       
        if (l < 0) {
            return n1;
        } else
            return (n1 + (3 * ((int) Math.pow(10, l))));
    }
}
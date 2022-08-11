class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
         int x =0;
        for(int i=0;i<s.length();i++){
       
            if(s.charAt(i)=='R'){
                x++;
            }else{
                x--;
            }
            if(x==0){
                count++;
            }
        }
        return count;
    }
}
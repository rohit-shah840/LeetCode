class Solution {
    public int mostWordsFound(String[] s) {
        int count=0,i,j;
        for(i=0;i<s.length;i++){
            int max=0;
            for(j=0;j<s[i].length();j++){
                if(s[i].charAt(j)==' ')
                    max++;
            }
            max+=1;
            if(count<max){
                count=max;
            }
        }
        return count;
    }
}
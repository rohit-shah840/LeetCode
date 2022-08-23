class Solution {
    public String reverseWords(String s) {
       int l=-1;
        int len = s.length();
        char[] ch= s.toCharArray();
        for(int i=0;i<=len;i++){
            if( i==len || s.charAt(i)==' ' ){
                int startIndex= l + 1;
                int endIndex= i-1;
            while(startIndex < endIndex){
                char temp = ch[startIndex];
                ch[startIndex] = ch[endIndex];
                ch[endIndex] = temp;
                startIndex++;
                endIndex--;
            }
            l=i;
         }
        }
        return new String(ch);
    }
}
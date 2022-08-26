class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            int l= words[i].length();
            int c=0;
            for(int j=0;j<l/2;j++){
                if(words[i].charAt(j)==words[i].charAt(l-1-j)){
                    c++;
                }
            }
            if(c==l/2){
                return words[i];
            }
        }
        return "";
    }
}
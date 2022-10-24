class Solution {
    public int maxLength(List<String> arr) {
        List<String> ansList = new ArrayList<>();
        int ans=0;
        ansList.add("");
        for(String s : arr){
            if(!CheckUniqueCharString(s)) continue;
            List<String> newAnsListWithCurrStr = new ArrayList<>();
            for(String candidate : ansList){
                String temp = candidate+s;
                if(CheckUniqueCharString(temp)){
                    newAnsListWithCurrStr.add(temp);
                    ans = Math.max(ans, temp.length());
                }
            }
            ansList.addAll(newAnsListWithCurrStr);
        }
        return ans;
    }
    public boolean CheckUniqueCharString(String s){
        if(s.length()>26) return false;
        int [] freq = new int[26];
        char []ch = s.toCharArray();
        for(char c :ch){
            freq[c-'a']++;
            if(freq[c-'a']>1)return false;
        }
        return true;
    }
}
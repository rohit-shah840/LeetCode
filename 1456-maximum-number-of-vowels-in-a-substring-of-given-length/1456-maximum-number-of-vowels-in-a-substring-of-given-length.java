class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int count=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))) count++;
        }
        max=count;
        for(int j=k;j<s.length();j++){
            if(isVowel(s.charAt(j-k))) count--;
            if(isVowel(s.charAt(j))) count++;
            max=Math.max(max,count);
        }
        return max;
    }
    boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')return true;
        return false;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int i=0;
        int j=0;
        HashSet<Character> ch = new HashSet();
        while(j<s.length()){
            if(!ch.contains(s.charAt(j))){
                ch.add(s.charAt(j));
                max= Math.max(ch.size(),max);
                j++;
            }else{
                ch.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}
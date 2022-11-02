class Solution {
    public int lengthOfLongestSubstring(String s) {
       int maxlen = 0;
        int start=0;
        Map<Character,Integer> map = new HashMap<>();
        for(int end =0;end<s.length();end++){
            char ch = s.charAt(end);
            //for duplicate check and update the start vlaues
            if(map.containsKey(ch)){
                start= Math.max(start,map.get(ch)+1);//start from the next index
            }
            map.put(ch,end);
            maxlen =Math.max(maxlen, end-start+1);
        }
        return maxlen;
    }
}

/*
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
*/
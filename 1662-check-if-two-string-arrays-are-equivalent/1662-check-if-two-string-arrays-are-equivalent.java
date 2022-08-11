class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(int i=0;i<word1.length;i++){
            s.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            s2.append(word2[i]);
        }
        int x=s.compareTo(s2);
        if(x==0)
        return true;
        else 
            return false;
    }
}
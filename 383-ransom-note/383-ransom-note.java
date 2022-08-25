class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     int[] arrcount = new int[26];
        for (char ch : magazine.toCharArray()) {
            arrcount[ch - 'a']++;
        }

        for (char ch : ransomNote.toCharArray()) {
            arrcount[ch - 'a']--;
            if (arrcount[ch - 'a'] < 0) {
                return false;
            }
        }

        return true; 
    }
}
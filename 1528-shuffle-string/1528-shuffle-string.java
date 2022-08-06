class Solution {
    public String restoreString(String s, int[] indices) {
     char str[] = new char[s.length()];
        for(int i=0;i<s.length();i++){
             str[indices[i]] =s.charAt(i);
        }
        String st = String.valueOf(str);
        return st;
    }
}
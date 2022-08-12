class Solution {
    public String toLowerCase(String s) {
        String str = "";
        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c)){
                str+=(char)(c+32);
            }else{
                str+=c;
            }
        }
        return str;
    }
}
class Solution {
    public String truncateSentence(String s, int k) {
        String str []= s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<k;i++){
            sb.append(str[i]+" ");
        }
        String a=sb.toString();
        return a.trim();
    }
}
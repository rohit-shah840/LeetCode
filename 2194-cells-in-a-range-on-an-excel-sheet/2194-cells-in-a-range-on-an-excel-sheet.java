class Solution {
    public List<String> cellsInRange(String s) {
        List<String> str = new ArrayList<String>();
        int firsti=s.charAt(1)-'0';
        int lasti= s.charAt(4)-'0';
        char firstchar=s.charAt(0);
        char lastchar = s.charAt(3);
        
        for(char i = firstchar; i<=lastchar;){
            for(int j=firsti;j<=lasti;j++){
                str.add(i+""+j);
            }
            i=(char)(i+1);
        }
        return str;
    }
}
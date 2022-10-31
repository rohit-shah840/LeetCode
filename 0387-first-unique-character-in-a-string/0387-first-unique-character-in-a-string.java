class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char [] c = s.toCharArray();
        for(char ch :c){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(int i=0;i<c.length;i++){
            char ch = c[i];
            if(map.get(ch)==1){
                return i;
            }
        }
        return -1;
    }
}
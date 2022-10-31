class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char [] c = s.toCharArray();
        for(char ch :c){
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)==2){
                return ch;
            }
        }
        return 'a';//this condition will never be true because their is always a twice letter       
    }
}

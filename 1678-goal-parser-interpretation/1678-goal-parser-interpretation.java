class Solution {
    public String interpret(String command) {
        String sc = new String();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                sc+=command.charAt(i);
            }else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                sc+='o';
                i++;
            }else if(command.charAt(i)=='(' && command.charAt(i+1)=='a' && command.charAt(i+2)=='l' && command.charAt(i+3)==')'){
                sc+="al";
                i+=3;
            }
        }
        return sc;
    }
}
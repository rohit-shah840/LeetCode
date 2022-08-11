class Solution {
    public String interpret(String command) {
        StringBuilder sc = new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                sc.append(command.charAt(i));
            }else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                sc.append('o');
                i++;
            }else if(command.charAt(i)=='(' && command.charAt(i+1)=='a' && command.charAt(i+2)=='l' && command.charAt(i+3)==')'){
                sc.append("al");
                i+=3;
            }
        }
        return sc.toString();
    }
}
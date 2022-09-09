class Solution {
    public boolean squareIsWhite(String coordinates) {
        int x=(int)coordinates.charAt(0) -'a';
        x+=1;
        int y = (int)coordinates.charAt(1)-'0';
        if((x%2!=0 && y%2==0) || (x%2==0 && y%2!=0)){
            return true;
        }
        return false;
    }
}
class Solution {
    public void rotate(int[][] m) {
        int r = m.length;
        int c =m[0].length;
        int i,j;
        
        for( i=0;i<r;i++){
            for(j=i;j<c;j++){
                int t= m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=t;
            }
        }
        
        for(i=0;i<r;i++){
            for(j=0;j<c/2;j++){
                int t = m[i][j];
                m[i][j]=m[i][c-1-j];
                m[i][c-1-j]=t;
            }
        }
    }
}
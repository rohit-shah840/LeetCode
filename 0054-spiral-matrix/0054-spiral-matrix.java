class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        ArrayList<Integer> a = new ArrayList<>();
        int  k=0,l=0,i;
        while(k<r && l<c){
        for(i=l;i<c;i++){
            a.add(matrix[k][i]);
        }
            k++;
            for(i=k;i<r;i++){
                a.add(matrix[i][c-1]);
            }
            c--;
            if(k<r){
                for(i=c-1;i>=l;i--){
                    a.add(matrix[r-1][i]);
                }
                r--;
            }
            if(l<c){
                for(i=r-1;i>=k;i--){
                    a.add(matrix[i][l]);
                }
                l++;
            }
     }
        return a;
    }
}
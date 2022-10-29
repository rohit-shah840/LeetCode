class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea =0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                   maxArea=Math.max(maxArea,dfs(grid,i,j));
                }
            }
        }
        return maxArea;
    }
    public int dfs(int [][]grid,int row, int col){
        if(row<0 || col<0 || row>=grid.length|| col>=grid[0].length || grid[row][col]==0){
            return 0;
        }
        grid[row][col]=0;//denotes that no need to visit again n again
        int count =1;
        count+=dfs(grid,row-1,col);//go up
        count+=dfs(grid,row+1,col);//go down
        count+=dfs(grid,row,col-1);//go left
        count+=dfs(grid,row,col+1);//go right
        return count;
    }
}
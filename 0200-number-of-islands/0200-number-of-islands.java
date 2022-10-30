class Solution {
    public int numIslands(char[][] grid) {
        int m= grid.length;
        int n=grid[0].length;
        boolean [][] visited = new boolean[m][n];
        int noOfIsland=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    dfs(grid,i,j,visited);
                    noOfIsland++;
                }
            }
        }
        return noOfIsland;
    }
    public void dfs(char[][]grid,int row,int col, boolean[][]visited){
        //base case
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || visited[row][col] || grid[row][col]=='0'){
            return;
        }
        visited[row][col]=true;
        dfs(grid,row,col-1,visited);//go left
        dfs(grid,row-1,col, visited);//go up
        dfs(grid,row, col+1,visited);//go right
        dfs(grid,row+1,col,visited);//go down
    }
}
class Solution {
    public int[][] largestLocal(int[][] grid) {
         int[][] ints = new int[grid.length - 2][grid.length - 2];

        for (int i = 1; i < grid.length-1 ; i++)
            for (int j = 1; j < grid.length - 1; j++)
                ints[i-1][j-1] = getMax(i,j,grid);

        return ints;
    }

    static int getMax(int i, int j, int[][] grid){
        int maxNum = grid[i][j];

        for (int k = i-1; k < i + 2; k++) 
            for (int l = j-1; l < j + 2; l++) 
                maxNum = Math.max(maxNum,grid[k][l]);
            
        return maxNum;
    }
}
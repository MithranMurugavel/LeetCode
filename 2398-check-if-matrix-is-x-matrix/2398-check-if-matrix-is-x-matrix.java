class Solution {
    public boolean checkXMatrix(int[][] grid) {
        
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                if(i==j || col-1-i==j){
                    if(grid[i][j]==0 || grid[col-1-i][j]==0){
                                return false;
                    }
                }
            }
        }
        return true;
    }
}
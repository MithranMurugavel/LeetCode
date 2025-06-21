class Solution {
    public boolean checkXMatrix(int[][] grid) {
        
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<col;i++){
            int val=col-1-i;
            for(int j=0;j<row;j++){
                if(i==j || val==j){
                    if(grid[i][j]==0 || grid[val][j]==0){
                                return false;
                    }
                }
                else if(grid[i][j]!=0)return false;
            }
        }
        return true;
    }
}
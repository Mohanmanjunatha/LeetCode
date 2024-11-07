class Solution {
    int count=0;
    public int numIslands(char[][] grid) {
        
        for( int i=0;i<grid.length;i++){
            for( int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                   dfs(grid,i,j);
                    count++; 
                }
            }
        }
        return count;
    }
    
    
    public void dfs(char [][] grid, int r, int c){
        
       //boundary conditions 
       if(r<0 || r>= grid.length || c<0 || c>= grid[0].length || grid[r][c] == 'v' || grid[r][c] == '0') return;
    
        //mark it visited
        grid[r][c] = 'v';

        //look in all 4 directions
        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);

    }
}
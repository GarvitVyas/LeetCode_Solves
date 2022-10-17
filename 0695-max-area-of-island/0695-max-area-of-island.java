class Solution {
  
    
    public int maxAreaOfIsland(int[][] grid) {
        int maxland = 0;
    
        if(grid.length==0) return 0;
      
        
        
        for(int i =0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    
                    maxland = Math.max(maxland, land(grid,i,j));
                }
            }
        }
        return maxland;
    }
    
    
    public int land(int[][] grid,int i,int j)
    {
        if(i>=0 && j>=0 && i<grid.length && j<grid[0].length && grid[i][j]==1)
        {
             grid[i][j] = 0;   
            return 1+ land(grid,i+1,j)+land(grid,i,j+1)+land(grid,i-1,j)+land(grid,i,j-1);
        
        }
        return 0;
    }
    
}
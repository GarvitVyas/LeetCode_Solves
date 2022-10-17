class Solution {
    private int n;
    private int m;
    public int numIslands(char[][] grid) {
        int island =0;
        n = grid.length;
        if(n==0) return 0;
        m= grid[0].length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                    island++;
                    land(grid,i,j);
                }
            }
        }
        return island;
    }
    
    
    public void land(char[][] grid,int i,int j)
    {
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]!='1') return;
        
        grid[i][j]='2';
        
        land(grid,i+1,j);
        land(grid,i,j+1);
        land(grid,i-1,j);
        land(grid,i,j-1);
    }
}
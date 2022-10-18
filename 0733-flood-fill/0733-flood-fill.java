class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        
        fill(image,sr,sc,image[sr][sc],color);
        return image;
    }
    
    
    
    public void fill(int[][] image,int i,int j,int c,int color)
    {
        if(i<0 || j<0 || i>=image.length || j>=image[0].length || image[i][j]!=c) return;
            
        image[i][j]=color;
            
            fill(image,i+1,j,c,color);
            fill(image,i,j+1,c,color);
            fill(image,i-1,j,c,color);
            fill(image,i,j-1,c,color);
        
    }
    
}


   
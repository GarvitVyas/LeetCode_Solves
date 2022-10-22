class Solution {
    public int[][] updateMatrix(int[][] mat) {
       int m = mat.length;
        int n = mat[0].length;
        // create result and visited array
        int[][] res = new int[m][n];
        boolean[][] visited = new boolean[m][n];
        // create a pair type queue
        Queue<Pair> que = new LinkedList<>();
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(mat[i][j] == 0){
                    que.add(new Pair(i , j , 0));
                }
            }
        }
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        // go for bfs traversal
        while(!que.isEmpty()){
            Pair curr = que.poll();
            if(visited[curr.r][curr.c]){
                continue;
            }
            // mark the visited and update the res array
            res[curr.r][curr.c] = curr.t;
            visited[curr.r][curr.c] = true;
            
            // go for the neighbours 
            for(int[] nums : directions){
                int row = curr.r + nums[0];
                int col = curr.c + nums[1];
                // handling the edge-cases
                if(row < 0 || col < 0 || row >= m || col >= n ||
                  visited[row][col]){
                    continue;
                }
                // now we are adding neighbour in queue so increament the distance
                que.add(new Pair(row , col , curr.t+1));
            }
        }
        return res;
    }
 }

public class Pair{
    int r;
    int c;
    int t;
    public Pair(int r , int c , int t){
        this.r = r;
        this.c = c;
        this.t = t;
    }
}

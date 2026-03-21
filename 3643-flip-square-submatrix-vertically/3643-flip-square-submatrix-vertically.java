class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int col=y;
        while(col<y+k){
            int start=x;
            int end=x+k-1;
            while(start<end){
                int temp=grid[start][col];
                grid[start][col]=grid[end][col];
                grid[end][col]=temp;
                start++;
                end--;
            }
            col++;
        }
        return grid;
    }
}
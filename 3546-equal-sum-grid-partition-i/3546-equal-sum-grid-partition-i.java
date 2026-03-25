class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        long[] rowsum=new long[rows];
        long[] colsum=new long[cols];
        long totalrowsum=0;
        for(int i=0;i<rows;i++){
            int sum=0;
            for(int j=0;j<cols;j++){
                sum+=grid[i][j];
                totalrowsum+=grid[i][j];
            }
            rowsum[i]=sum;
        }
        int c=0;
        long totalcolsum=0;
        while(c<cols){
            int sum=0;
            for(int i=0;i<rows;i++){
                sum+=grid[i][c];
                totalcolsum+=grid[i][c];
            }
            colsum[c]=sum;
            c++;
        }
        if(check(rowsum,totalrowsum) || check(colsum,totalcolsum)){
            return true;
        }
        return false;
    }
    static boolean check(long[] rowsum,long totalrowsum){
        long currsum=0;
        for(int i=0;i<rowsum.length-1;i++){
            currsum+=rowsum[i];
            totalrowsum-=rowsum[i];
            if(currsum==totalrowsum){
                return true;
            }
        }
        return false;
    }
}
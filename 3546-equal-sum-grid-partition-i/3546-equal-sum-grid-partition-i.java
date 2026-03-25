class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        long total=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                total+=grid[i][j];
            }
        }

        //for row
        long currsumrow=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                currsumrow+=grid[i][j];
            }

            if(currsumrow==total-currsumrow){
                return true;
            }
        }

        //for columns
        long currsumcol=0;
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                currsumcol+=grid[j][i];
            }
            if(currsumcol==total-currsumcol){
                return true;
            }
        } 
        return false;
    }
   
}


//    long[] rowsum=new long[rows];
//         long[] colsum=new long[cols];
//         long totalrowsum=0;
//         long totalcolsum=0;
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 int val=grid[i][j];
//                 rowsum[i]+=val;
//                 colsum[j]+=val;
//                 totalrowsum+=grid[i][j];
//                 totalcolsum+=grid[i][j];
//             }
//         }
//         if(check(rowsum,totalrowsum) || check(colsum,totalcolsum)){
//             return true;
//         }
//         return false;
//     }

//  static boolean check(long[] rowsum,long totalrowsum){
//         long currsum=0;
//         for(int i=0;i<rowsum.length-1;i++){
//             currsum+=rowsum[i];
//             totalrowsum-=rowsum[i];
//             if(currsum==totalrowsum){
//                 return true;
//             }
//         }
//         return false;
//     }
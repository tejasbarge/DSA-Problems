class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] ans=new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            int vertex=0;
            for(int j=0;j<matrix[i].length;j++){
                vertex+=matrix[i][j];
            }
            ans[i]=vertex;
        }
        return ans;
    }
}
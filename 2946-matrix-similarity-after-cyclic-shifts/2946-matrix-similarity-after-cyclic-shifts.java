class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        k=k%mat[0].length;
        int rows=mat.length;
        int cols=mat[0].length;
        int[][] mat1=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat1[i][j]=mat[i][j];
            }
        }
        for(int i=0;i<rows;i++){
            shifts(mat,i,k);
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]!=mat1[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    static void shifts(int[][] mat,int row,int k){
        int len=mat[row].length;
        rev(mat,row,0,len-1);
        if(row%2==0){
            rev(mat,row,0,len-1-k);
            rev(mat,row,len-k,len-1);
            return ;
        }
        rev(mat,row,0,k-1);
        rev(mat,row,k,len-1);
        return ;
    }

    static void rev(int[][] mat,int row,int start,int end){
        while(start<end){
            int temp=mat[row][start];
            mat[row][start]=mat[row][end];
            mat[row][end]=temp;
            start++;
            end--;
        }
        return ;
    }
}
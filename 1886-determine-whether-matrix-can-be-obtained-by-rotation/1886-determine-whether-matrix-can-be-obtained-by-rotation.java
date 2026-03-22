class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int count=0;
        while(count<4){
            boolean flag=check(mat,target);
            if(flag){
                return true;
            }
            count++;
            rotate(mat);
        }
        return false;
    }
    static void rotate(int[][] mat){
        int row=mat.length;
        int col=mat[0].length;
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<row;i++){
            int start=0,end=mat[0].length-1;
            while(start<end){
                int temp=mat[i][start];
                mat[i][start]=mat[i][end];
                mat[i][end]=temp;
                start++;
                end--;
            }
        }
        return ;   
    }
    static boolean check(int[][] mat1,int[][] mat2){
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[0].length;j++){
                if(mat1[i][j]!=mat2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
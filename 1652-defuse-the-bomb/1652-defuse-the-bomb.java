class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] ans=new int[code.length];
        if(code.length==1 && k!=0){
                return code;
        }
        if(k==0){
            
        }
        else if(k>0){
            int sum=0;
            for(int i=1;i<=k;i++){
                sum+=code[i];
            }
            ans[0]=sum;
            for(int i=1;i<code.length;i++){
                sum=sum-code[i]+code[(k+i)%code.length];
                ans[i]=sum;
            }
        }
        else{
            int sum=0;
            k=Math.abs(k);
            int n=code.length;
            for(int i=n-1;i>=n-k;i--){
                sum+=code[i];
            }
            ans[0]=sum;
            for(int i=1;i<code.length;i++){
                sum=sum-code[((n-k-1+i)%n)]+code[i-1];
                ans[i]=sum;
            }
        }
        return ans;
    }
}
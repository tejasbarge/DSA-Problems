class Solution {
    public boolean validDigit(int n, int x) {
        int totaldigits=0;
        int xcount=0;
        int temp=n;
        if(n==0){
            return false;
        }
        while(temp>0){
            totaldigits+=1;
            int rem=temp%10;
            if(rem==x){
                xcount++;
            }
            temp=temp/10;
        }
        int first=n/(int)Math.pow(10,totaldigits-1);
        if(first==x){
            return false;
        }
        if(xcount<=0){
            return false;
        }
        return true;
    }
}
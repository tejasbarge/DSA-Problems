class Solution {
    public int pivotInteger(int n) {
        int sum=n*(n+1)/2;
        int temp=n;
        int endsum=0;
        while(endsum<=sum){
            if(sum==(temp+endsum)){
                return temp;
            }
            else{
                sum=sum-temp;
                endsum=endsum+temp;
                temp=temp-1;
            }
        }
        return -1;
    }
}
class Solution {
    public boolean checkGoodInteger(int n) {
        int dSum=0;
        int sSum=0;
        while(n>0){
            int rem=n%10;
            dSum+=rem;
            sSum=sSum+(rem*rem);
            if(sSum-dSum>=50){
                return true;
            }
            n=n/10;
        }
        return false;
    }
}
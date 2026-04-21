class Solution {
    public int totalHammingDistance(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i=0;i<32;i++){
            int ones=0;
            for(int num:nums){
                if(((num>>i)&1)==1){
                    ones++;
                }
            }
            int zeros=n-ones;
            total+=zeros*ones;
        }
        return total;
    }
}
class Solution {
    public int minimumSwaps(int[] nums) {
        int zeros=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeros++;
            }
        }
        int operations=0;
        for(int i=nums.length-1;i>=0;i--){
            if(zeros==0){
                break;
            }
            if(nums[i]!=0){
                operations++;
            }
            zeros--;
        }
        return operations;
    }
}
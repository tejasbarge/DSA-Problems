class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n=nums.length;
        long totalsum=0;
        for(int i=n-1;i>=n-k;i--){
            if(mul>1){
                totalsum+=(long)nums[i]*mul;
            }
            else{
                totalsum+=nums[i];
            }
            mul=mul-1;
        }
        return totalsum;
    }
}
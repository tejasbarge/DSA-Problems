class Solution {
    public int longestOnes(int[] nums, int k) {
       int zeros=0;
       int maxi=0;
       int n=nums.length;
       int right=0;
       int left=0;
       while(right<n){
        if(nums[right]==0){
            zeros++;
        }

        if(zeros<=k){
            maxi=maxi<right-left+1?right-left+1:maxi;
        }
        
        while(zeros>k){
            if(nums[left]==0){
                zeros--;
            }
            left++;
        }
        
        right++;

       }
        return maxi;
    }
}
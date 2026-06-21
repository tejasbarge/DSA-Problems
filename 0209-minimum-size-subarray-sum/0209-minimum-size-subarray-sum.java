class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=nums.length+1;
        int left=0;
        int right=0;
        int n=nums.length;
        int sum=0;
        while(right<n ){
            sum+=nums[right];
            if(sum>=target){
                min=min<right-left+1?min:right-left+1;
            }
            while(left<n && sum>=target){
                sum=sum-nums[left];
                left++;
                if(sum>=target){
                min=min<right-left+1?min:right-left+1;
                }

            }
            right++;
        }
        return min==nums.length+1?0:min;
    }
}
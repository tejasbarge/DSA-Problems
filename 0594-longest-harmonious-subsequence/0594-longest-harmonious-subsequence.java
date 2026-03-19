class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int left=0,right=0,maxi=0;
        int prev=nums[0];
        while(right<nums.length){
            int curr=nums[right];
            int diff=Math.abs(nums[right]-nums[left]);
            if(diff==1){
                maxi=right-left+1>maxi?right-left+1:maxi;
            }
            else{
                while(left<right && Math.abs(nums[left]-nums[right])>1){
                    left++;
                }
            }
            right++;
        }
        return maxi;
    }
}
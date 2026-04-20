class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int suffix[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            min=nums[i]<min?nums[i]:min;
            suffix[i]=min;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=max<nums[i]?nums[i]:max;
            int stability=max-suffix[i];
            if(stability<=k){
                return i;
            }
        }
        return -1;
    }
}
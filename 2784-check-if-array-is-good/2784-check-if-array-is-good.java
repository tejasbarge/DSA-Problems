class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length;
        if(n<2){
            return false;
        }
        boolean[] hash=new boolean[nums.length-2];
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==nums.length-1){
                count++;
            }
            else if(nums[i]<nums.length-1){
                hash[nums[i]-1]=true;
            }
            else{

            }
        }
        int i=0;
        while(i<hash.length){
            if(!hash[i]){
                return false;
            }
            i++;
        }
        return i==hash.length && count==2?true:false;
    }
}
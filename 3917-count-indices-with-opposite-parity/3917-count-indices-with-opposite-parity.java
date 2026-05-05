class Solution {
    public int[] countOppositeParity(int[] nums) {
        int[] ans=new int[nums.length];
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                evencount++;
            }else{
                oddcount++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[i]=oddcount;
                evencount--;
            }else{
                ans[i]=evencount;
                oddcount--;
            }
        }
        return ans;
    }
}
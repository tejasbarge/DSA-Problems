class Solution {
    public int[] concatWithReverse(int[] nums) {
        int i=0;
        int[] ans=new int[2*nums.length];
        while(i<nums.length){
            ans[i]=nums[i];
            i++;
        }
        i--;
        int j=nums.length;
        while(j<2*nums.length){
            ans[j]=nums[i];
            j++;
            i--;
        }
        return ans;
    }
}
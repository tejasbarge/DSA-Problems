class Solution {
    public int compareBitonicSums(int[] nums) {
        int n=nums.length;
        int i=0;
        long firstsum=0;
        while(i<n-1){
            firstsum+=nums[i];
            if(nums[i]>nums[i+1]){
                break;
            }
            i++;
        }
        long secondsum=0;
        while(i<n){
            secondsum+=nums[i];
            i++;
        }
        if(firstsum==secondsum){
            return -1;
        }
        return firstsum>secondsum?0:1;
    }
}
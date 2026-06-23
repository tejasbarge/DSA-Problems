class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int subsum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                subsum+=nums[j];
                int temp=subsum;
                if(temp%10==x){
                    int first=-1;
                    while(temp>0){
                        int rem=temp%10;
                        first=rem;
                        temp=temp/10;
                    }
                    if( first==x){
                        count++;
                    }
                }
            }
            subsum=0;
        }
        return count;
    }
}
class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int q=queries.length;
        int qno=0;
        while(qno<q){
            int i=queries[qno][0],end=queries[qno][1];
            while(i<=end){
                nums[i]=(int)((1L*nums[i]*queries[qno][3]) % 1000000007);
                i+=queries[qno][2];  
            }
            qno++;
        }
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
}
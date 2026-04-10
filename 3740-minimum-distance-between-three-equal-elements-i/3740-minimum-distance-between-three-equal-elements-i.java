class Solution {
    public int minimumDistance(int[] nums) {
        // HashMap <Integer,Integer> freq=new HashMap<>();
        // HashMap <Integer,Integer> distance=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     freq.put(nums[i],map.getOrDefault(nums[i],0)+1);

        // }
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i!=j && j!=k && i!=k && nums[i]==nums[j] && nums[j]==nums[k]){
                        int m=Math.abs(i-j)+Math.abs(j-k)+Math.abs(i-k);
                        min=min>m?m:min;
                    }
                }
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}
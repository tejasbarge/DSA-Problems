class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int rev=rev(nums[i]);
            if(map.containsKey(rev)){
                int dist=i-map.get(rev);
                min=Math.min(min,dist);
            }
            map.put(nums[i],i);
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
    static int rev(int n){
        int ans=0;
        while(n!=0){
            int rem=n%10;
            ans=ans*10+rem;
            n=n/10;
        }
        return ans;
    }
}
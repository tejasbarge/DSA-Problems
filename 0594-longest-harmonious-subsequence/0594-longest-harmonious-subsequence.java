class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxi=0;
        for(int key: map.keySet()){
            if(map.containsKey(key+1)){
                int length=map.get(key)+map.get(key+1);
                maxi=Math.max(maxi,length);
            }
        }
        return maxi;
    }
}


//using sliding window+sorting
// Arrays.sort(nums);
//         int left=0,right=0,maxi=0;
//         int prev=nums[0];
//         while(right<nums.length){
//             int curr=nums[right];
//             int diff=Math.abs(nums[right]-nums[left]);
//             if(diff==1){
//                 maxi=right-left+1>maxi?right-left+1:maxi;
//             }
//             //else{
//                 while(left<right && Math.abs(nums[left]-nums[right])>1){
//                     left++;
//                 }
//             //}
//             right++;
//         }
//         return maxi;
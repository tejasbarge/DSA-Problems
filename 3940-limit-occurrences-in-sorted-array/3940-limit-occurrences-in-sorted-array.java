class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        int count=1;
        int last=nums[0];
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(last==nums[i]){
                count++;
            }
            else{
                count=1;
            }
            last=nums[i];
            if(count<=k){
                list.add(nums[i]);
            }
        }
        int[] ans=new int[list.size()];
        int i=0;
        for(Integer num:list){
            ans[i]=num;
            i++;
        }
        return ans;
    }
}
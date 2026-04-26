class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int[] maxA=new int[nums.length];
        int max=nums[nums.length-1];
        for(int i=nums.length-1;i>=0;i--){
            max=nums[i]>max?nums[i]:max;
            maxA[i]=max;
        }
        int leftmax=nums[0];
        list.add(nums[0]);
        if(nums.length==1){
            return list;
        }
        for(int i=1;i<nums.length-1;i++){
            leftmax=nums[i-1]>leftmax?nums[i-1]:leftmax;
            if(nums[i]>leftmax){
                list.add(nums[i]);
                continue;
            }
            else if(nums[i]>maxA[i+1]){
                list.add(nums[i]);
            }
            else{

            }
        }
        list.add(nums[nums.length-1]);
        return list;
    }
}
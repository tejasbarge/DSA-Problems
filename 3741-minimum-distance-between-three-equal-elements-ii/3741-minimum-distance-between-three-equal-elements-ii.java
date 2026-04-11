class Solution {
    public int minimumDistance(int[] nums) {
        HashMap <Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])==false){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        int min=Integer.MAX_VALUE;
        for(List<Integer> list:map.values()){
            if(list.size()>=2){
                for(int i=0;i+2<list.size();i++){
                    int minIndex=list.get(i);
                    int maxIndex=list.get(i+2);
                    min=Math.min(min,2*(maxIndex-minIndex));
                }
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}
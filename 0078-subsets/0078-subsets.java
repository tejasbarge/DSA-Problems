class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> outerList=new ArrayList<>();
        outerList.add(new ArrayList<>());
        for(Integer num:nums){
            int size=outerList.size();
            for(int i=0;i<size;i++){
                List<Integer> inner=new ArrayList<>(outerList.get(i));
                inner.add(num);
                outerList.add(inner);
            }
        }
        return outerList;
    }
}
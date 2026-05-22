class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set=new HashSet<>();
        for(Integer num:arr1){
            while(num>0){
                set.add(num);
                num=num/10;
            }
        }
        Integer max=0;
        for(Integer num:arr2){
            while(num>0){
                if(set.contains(num) && num>max){
                    max=num;
                }
                num=num/10;
            }
        }
        int count=0;
        while(max>0){
            count++;
            max=max/10;
        }
        return count;
    }
}
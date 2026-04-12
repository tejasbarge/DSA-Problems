class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
       int total=0;
       for(int i=0;i<nums.length;i++){
        total+=Count(nums[i],digit);
       } 
       return total;
    }
    static int Count(int num,int digit){
        int totalcount=0;
        while(num!=0){
            int rem=num%10;
            totalcount=digit==rem?totalcount+1:totalcount;
            num=num/10;
        }
        return totalcount;
    }
}
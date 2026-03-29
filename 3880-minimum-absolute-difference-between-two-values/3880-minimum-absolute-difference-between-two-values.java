class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int lastseen=-1;
        int lastseenIndex=-1;
        int i=0;
        int minL=Integer.MAX_VALUE;
        while(i<nums.length){
            if(nums[i]==1){
                lastseen=1;
                lastseenIndex=i;
                break;
            }
            if(nums[i]==2){
                lastseen=2;
                lastseenIndex=i;
                break;
            }
            i++;
        }
        if(i==nums.length){
            return -1;
        }
        boolean flag=false;
        for(int j=i;j<nums.length;j++){
            if(lastseen==1 && nums[j]==2){
                minL=j-lastseenIndex<minL?j-lastseenIndex:minL;
                lastseen=2;
                lastseenIndex=j;
                flag=true;
            }
            if(lastseen==2 && nums[j]==1){
                minL=j-lastseenIndex<minL?j-lastseenIndex:minL;
                lastseen=1;
                lastseenIndex=j;
                flag=true;
            }
        }
        if(flag==false){
            return -1;
        }
        return minL;
    }
}
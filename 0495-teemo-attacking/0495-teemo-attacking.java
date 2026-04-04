class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
       int n=timeSeries.length;
       int seconds=0;
       if(n==1){
        return duration;
       }
       int next=1;
       for(int i=0;i<n-1;i++){
        if(timeSeries[i]+duration-1>=timeSeries[next]){
            seconds+=timeSeries[next]-timeSeries[i];
        }
        else{
            seconds+=duration;
        }
        next++;
       }

       return seconds+duration;
    }
}
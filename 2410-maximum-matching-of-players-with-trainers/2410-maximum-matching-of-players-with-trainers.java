class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int p=0;
        int ans=0;
        int t=0;
        int pl=players.length,tl=trainers.length;
        while(p<pl && t<tl){
            if(players[p]<=trainers[t]){
                ans+=1;
                p++;
                t++;
            }
            else{
                t++;
            }
        }
        return ans;
    }
}
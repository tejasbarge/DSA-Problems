class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0,count=0;
        for(int i=0;i<events.length;i++){
            if(events[i].equals("W")){
                count+=1;
                if(count==10){
                    break;
                }
            }
            else if(events[i].equals("NB") || events[i].equals("WD")){
                score+=1;
            }
            else{
                score=score+Integer.parseInt(events[i]);
            }
        }
        return new int[] {score, count};
    }
}
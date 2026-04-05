class Solution {
    public boolean judgeCircle(String moves) {
        int lr=0,ud=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                ud+=1;
            }
            else if(moves.charAt(i)=='D'){
                ud-=1; 
            }
            else if(moves.charAt(i)=='L'){
                lr+=1;
            }
            else{
                lr-=1;
            }
        }
        return lr==0 && ud==0;
    }
}
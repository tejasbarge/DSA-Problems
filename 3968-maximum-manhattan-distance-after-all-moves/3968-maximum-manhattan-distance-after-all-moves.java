class Solution {
    public int maxDistance(String moves) {
        int x=0;
        int y=0;
        int _count=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='L'){
                x--;
            }
            else if(ch=='R'){
                x++;
            }
            else if(ch=='U'){
                y++;
            }
            else if( ch=='D'){
                y--;
            }
            else{
                _count++;
            }
        }
        return Math.abs(x)+Math.abs(y)+_count;
    }
}
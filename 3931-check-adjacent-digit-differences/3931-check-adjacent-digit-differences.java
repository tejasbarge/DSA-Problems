class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int n=s.length();
        int i=n-1;
        while(i>=1){
            int last=s.charAt(i)-'0';
            int secondlast=s.charAt(i-1)-'0';
            if(Math.abs(last-secondlast)>2){
                return false;
            }
            i--;
        }
        return true;
    }
}
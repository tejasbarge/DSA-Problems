class Solution {
    public int countGoodSubstrings(String s) {
        int[] hash=new int[26];
        int left=0,right=0,count=0;
        while(right<s.length()){
            int index=s.charAt(right)-'a';
            hash[index]+=1;
            while( right-left+1>3 || hash[index]>1){
                int leftindex=s.charAt(left)-'a';
                hash[leftindex]-=1;
                left++;
            }
            if(right-left+1==3){
                count++;
            }
            right++;
        }
        return count;
    }
}
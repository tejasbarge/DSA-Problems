class Solution {
    public int characterReplacement(String s, int k) {
        int[] hash=new int[26];
        int maxF=0;
        int left=0,right=0,max=0;
        while(right<s.length()){
            int ch=s.charAt(right)-'A';
            hash[ch]++;
            maxF=maxF<hash[ch]?hash[ch]:maxF;
            while(right-left+1-maxF>k){
                hash[s.charAt(left)-'A']--;
                left++;
            }
            max=max<right-left+1?right-left+1:max;
            right++;
        }
        return max;
    }
}
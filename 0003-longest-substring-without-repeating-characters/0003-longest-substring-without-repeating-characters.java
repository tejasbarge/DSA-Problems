class Solution {
    public int lengthOfLongestSubstring(String s) {
        int right=0;
        int left=0;
        int max=0;
        int n=s.length();
        int[] hash=new int[256];
        while(right<n){
            char ch=s.charAt(right);
            hash[ch]=hash[ch]+1;
            while(hash[ch]>1){
                hash[s.charAt(left)]-=1;
                left++;
            }
            max=right-left+1>max?right-left+1:max;
            right++;
        }
        return max;
    }
}
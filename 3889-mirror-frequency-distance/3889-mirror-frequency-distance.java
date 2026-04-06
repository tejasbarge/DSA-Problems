class Solution {
    public int mirrorFrequency(String s) {
        int[] hashL=new int[26];
        int[] hashN=new int[10];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                hashN[ch-'0']++;
            }
            else{
                hashL[ch-'a']++;
            }
        }
        return countSum(hashL)+countSum(hashN);
    }
    static int countSum(int[] arr){
        int start=0,end=arr.length-1;
        int sum=0;
        while(start<end){
            sum+=Math.abs(arr[start]-arr[end]);
            start++;
            end--;
        }
        return sum;
    }
}
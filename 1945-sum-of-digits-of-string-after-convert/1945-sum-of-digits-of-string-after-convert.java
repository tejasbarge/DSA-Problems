class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int no=ch-'a'+1;
            sb.append(no);
        }
        String str=sb.toString();
        int temp=2;
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            int n=ch-'0';
            sum+=n;
        }
        while(temp<=k){
            int tempnum=sum;
            sum=sum(tempnum);
            temp++;
        }
        return sum;
    }
    static int sum(int n){
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans+=rem;
            n=n/10;
        }
        return ans;
    }
}
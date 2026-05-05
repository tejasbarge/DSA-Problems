class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev=reverse(n);
        int start=rev>n?n:rev;
        int end=rev>n?rev:n;
        int sum=0;
        for(int i=start;i<=end;i++){
            if(i==2){
                sum+=2;
            }
            if(i%2==0 || i<2){
                continue;
            }
            else{
                sum=checkPrime(i)==true?sum+i:sum;
            }
        }
         return sum;
    }
    static int reverse(int n){
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=ans*10+rem;
            n=n/10;
        }
        return ans;
    }
    static boolean checkPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public int findGCD(int[] nums) {
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            smallest=smallest<nums[i]?smallest:nums[i];
            largest=largest>nums[i]?largest:nums[i];
        }
        return gcd(smallest,largest);
    }
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
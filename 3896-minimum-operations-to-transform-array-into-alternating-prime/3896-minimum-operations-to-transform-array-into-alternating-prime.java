class Solution {
    public int minOperations(int[] nums) {
        int operations=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                boolean flag=isPrime(nums[i]);
                int num=nums[i];
                while(!flag){
                    if(nums[i]%2==1 && nums[i]>3){
                        num+=2;
                        flag=isPrime(num);
                        operations+=2;
                    }
                    else{
                        num+=1;
                        flag=isPrime(num);
                        operations+=1;
                    }
                }
            }
            else{
                if(isPrime(nums[i])){
                    if(nums[i]==2){
                        operations+=2;
                    }
                    else{
                        operations+=1;
                    }
                }   
            }
        }  
        return operations;
    }
     static boolean isPrime(int n){
            if(n==1){
                return false;
            }
            if(n==2){
                return true;
            }
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
}
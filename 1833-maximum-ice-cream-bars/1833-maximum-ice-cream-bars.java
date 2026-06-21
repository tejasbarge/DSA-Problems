class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=Integer.MIN_VALUE;
        for(int num: costs){
            max=max>num?max:num;
        }
        int[] freq=new int[max+1];
        for(int num:costs){
            freq[num]+=1;
        }
        int count=0;
        boolean flag=false;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0){
                continue;
            }
            while(freq[i]>=1){
                coins=coins-i;
                freq[i]=freq[i]-1;
                if(coins>=0){
                    count++;
                }else{
                    flag=true;
                    break;
                }
            }
            if(flag){
                return count;
            }
        }
        return count;
    }
}
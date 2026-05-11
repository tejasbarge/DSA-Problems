class Solution {
    public int[] separateDigits(int[] nums) {
        Stack<Integer>st=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            int temp=nums[i];
            while(temp>0){
                int rem=temp%10;
                st.push(rem);
                temp=temp/10;
            }
        }
        int[] ans=new int[st.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=st.pop();
        }
        return ans;
    }
}
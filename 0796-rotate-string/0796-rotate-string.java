class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        int m=goal.length();
        if(n!=m){
            return false;
        }
        String temp=s;
        for(int i=0;i<s.length();i++){
            if(temp.equals(goal)){
                return true;
            }
            temp=temp.substring(1)+temp.charAt(0);
        }
        return false;
    }
}
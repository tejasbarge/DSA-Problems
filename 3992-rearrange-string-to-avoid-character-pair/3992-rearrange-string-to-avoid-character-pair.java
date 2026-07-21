class Solution {
    public String rearrangeString(String s, char x, char y) {
        int start=0;
        int end=s.length()-1;
        char[] c=s.toCharArray();
        while(start<end){
            if(c[start]==x && c[end]==y){
                char temp=c[start];
                c[start]=c[end];
                c[end]=temp;
            }
            if(c[start]!=x){
                start++;
            }
            if(c[end]!=y){
                end--;
            }
        }
        return String.valueOf(c);
    }
}
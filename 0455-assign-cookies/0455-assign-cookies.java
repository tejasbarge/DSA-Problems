class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i=0,j=0,il=g.length,jl=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        while(i<il && j<jl){
            if(g[i]<=s[j]){
                count+=1;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return count;
    }
}
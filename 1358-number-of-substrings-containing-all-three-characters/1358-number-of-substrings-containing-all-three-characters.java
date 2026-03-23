class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int count=0;
        int[] hash={-1,-1,-1};
        for(int i=0;i<n;i++){
           char ch=s.charAt(i);
           hash[ch-'a']=i;
           count+=findmin(hash)+1;
        }
        return count;
    }
    static int findmin(int[] hash){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<hash.length;i++){
            min=min>hash[i]?hash[i]:min;
        }
        return min;
    }
}

// int count=0;
//         int n=s.length();
//         for(int i=0;i<n;i++){
//             int[] hash=new int[3];
//             for(int j=i;j<n;j++){
//                 char ch=s.charAt(j);
//                 hash[ch-'a']=1;
//                 if(hash[0]+hash[1]+hash[2]==3){
//                     count=count+1;
//                 }
//             }
//         }
//         return count;
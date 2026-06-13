class Solution {
    public static String mapWordWeights(String[] words, int[] weights) {
        int n=words.length;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<n;i++){
            String curr=words[i];
            int sum=0;
            for(int j=0;j<curr.length();j++){
                int index=curr.charAt(j)-'a';
                sum+=weights[index];
            }
            sum=sum%26;
            int con='a' + 26-sum-1;
            char c=(char)con;
           // System.out.println(c);
            sb.append(c);
        }
        return sb.toString();
    }
}
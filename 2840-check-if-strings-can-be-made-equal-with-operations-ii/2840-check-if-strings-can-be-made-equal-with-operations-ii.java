class Solution {
    public boolean checkStrings(String s1, String s2) {
     int n=s1.length();
     int[] odd1=new int [26];
     int[] even1=new int[26];
     int[] odd2=new int[26];
     int[] even2=new int[26];
     for(int i=0;i<n;i++){
        if(i%2==0){
            even1[s1.charAt(i)-'a']+=1;
            even2[s2.charAt(i)-'a']+=1;
        }
        else{
            odd1[s1.charAt(i)-'a']+=1;
            odd2[s2.charAt(i)-'a']+=1;
        }
     }
     for(int i=0;i<26;i++){
        if(odd1[i]!=odd2[i]){
            return false;
        }
        if(even1[i]!=even2[i]){
            return false;
        }
     }   
     return true;
    }
}
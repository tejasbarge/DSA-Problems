class Solution {
    public int maxNumberOfBalloons(String text) {
        String str="balloon";
        int[] hash=new int[26];
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            int index=ch-'a';
            hash[index]=hash[index]+1;
        }
        int bindex='b'-'a';
        int bcount=hash[bindex];
        int aindex='a'-'a';
        int acount=hash[aindex];
        int lindex='l'-'a';
        int lcount=hash[lindex];
        int oindex='o'-'a';
        int ocount=hash[oindex];
        int nindex='n'-'a';
        int ncount=hash[nindex];
        int count=0;
        while(true){
            if(bcount>=1 && acount>=1 && lcount>=2 && ocount>=2 && ncount>=1){
                count++;
                bcount-=1;
                acount-=1;
                lcount-=2;
                ocount-=2;
                ncount-=1;
            }
            else{
                break;
            }
        }
        return count;

    }
}
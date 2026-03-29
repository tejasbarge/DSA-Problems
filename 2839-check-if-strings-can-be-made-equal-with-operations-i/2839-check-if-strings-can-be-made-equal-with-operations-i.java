class Solution {
    public boolean canBeEqual(String s1, String s2) {
    //    if(s1.charAt(0)!=s2.charAt(0) || s1.charAt(0) !=s2.charAt(3)){
    //     return false;
    //    }
    boolean res1=check(0,2,s1,s2);
    boolean res2=check(1,3,s1,s2);
    if(res1==true && res2==true){
        return true;
    }
    return false;
        
    }
    static boolean check(int i,int j,String s1,String s2){
        if(s1.charAt(i)==s2.charAt(i)){
            if(s1.charAt(j)==s2.charAt(j)){
                return true;
            }
            return false;
        }
        else if(s1.charAt(i)==s2.charAt(j)){
                if(s1.charAt(j)==s2.charAt(i)){
                    return true;
                }
                return false;
            }
        return false;
    }
}
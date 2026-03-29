class Solution {
    public boolean canBeEqual(String s1, String s2) {
    boolean res1=check(0,2,s1,s2);
    boolean res2=check(1,3,s1,s2);
    return res1==true && res2==true;
        
    }
    static boolean check(int i,int j,String s1,String s2){
        char a=s1.charAt(i), b=s1.charAt(j);
        char c=s2.charAt(i), d=s2.charAt(j);
        if((a==c && b==d) || (a==d && b==c)){
            return true;
        }
        return false;
    }
}

// if(s1.charAt(i)==s2.charAt(i)){
//             if(s1.charAt(j)==s2.charAt(j)){
//                 return true;
//             }
//             return false;
//         }
//         else if(s1.charAt(i)==s2.charAt(j)){
//                 if(s1.charAt(j)==s2.charAt(i)){
//                     return true;
//                 }
//                 return false;
//             }
//         return false;
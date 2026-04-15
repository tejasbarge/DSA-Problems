class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        int Shortest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                if(startIndex==i){
                    return 0;
                }
                else if(startIndex<i){
                    int forward=i-startIndex;
                    int backward=(startIndex-0)+(n-i);
                    int smallest=forward>backward?backward:forward;
                    Shortest=Shortest>smallest?smallest:Shortest;

                }
                else{
                    int backward=startIndex-i;
                    int forward=(n-startIndex)+i;
                    int smallest=forward>backward?backward:forward;
                    Shortest=Shortest>smallest?smallest:Shortest;
                }
            }
        }
        return Shortest==Integer.MAX_VALUE?-1:Shortest;      
    }
}
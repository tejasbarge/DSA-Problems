class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int n=nums1.length;
        int m=nums2.length;
        int maxd=0;
        while(j<m && i<n){
            if(nums1[i]<=nums2[j]){
                maxd=Math.max(maxd,j-i);
                j++;
            }
            else{
                i++;
            }
        }
        return maxd;
    }
}
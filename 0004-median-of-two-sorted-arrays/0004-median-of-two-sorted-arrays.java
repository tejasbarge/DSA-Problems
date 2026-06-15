class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l=nums1.length+nums2.length;
        int []ans=new int[l];
        int s1=0;
        int s2=0;
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0;
        while(s1<n1 && s2<n2){
            if(nums1[s1]<nums2[s2]){
                ans[i]=nums1[s1];
                s1++;
                i++;
            }
            else{
                ans[i]=nums2[s2];
                i++;
                s2++;
            }
        }
        while(s1<n1){
            ans[i]=nums1[s1];
            i++;
            s1++;
        }
        while(s2<n2){
            ans[i]=nums2[s2];
            i++;
            s2++;
        }
        if(l%2==0){
            double ans1=(ans[l/2-1]+ans[l/2])/2.0;
            return ans1; 
        }
        return (double)ans[(l/2)];
    }
}
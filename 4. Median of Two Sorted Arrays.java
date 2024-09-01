class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        int c[]=new int[n+m];
        System.arraycopy(nums1,0,c,0,n);
        System.arraycopy(nums2,0,c,n,m);
        Arrays.sort(c);
        if((n+m)%2!=0){
            return (double)c[(n+m)/2];
        }else{
            return (double)(c[(n+m)/2]+c[((n+m)/2)-1])/2;
        }
    }
}
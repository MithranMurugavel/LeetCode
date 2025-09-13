class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n1=nums1.length,n2=nums2.length;
        int[] arr=new int[n1+n2];

        int val=0;
        for(int i=0;i<n1;i++) arr[val++]=nums1[i];

        for(int i=0;i<n2;i++) arr[val++]=nums2[i];

        int n=arr.length;
        Arrays.sort(arr);
        if(n%2 == 1) {
            return (float) arr[n/2];
        }
        else{
            return (float) (arr[n/2] + arr[n/2 - 1])/2;
        }
    }
}
class Leetcode4{
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int start = 0;
        int end = m;
        int median=(m + n + 1) / 2;
        while(start<=end){
            int part1=(start+end)/2;
            int part2=median-part1;
            int l1= part1==0?Integer.MIN_VALUE:nums1[part1-1];//find the Left maximum Element in the 1st array
            int l2= part2==0?Integer.MIN_VALUE:nums2[part2-1];//find the left maximum element in the 2nd array
            int r1= part1==m?Integer.MAX_VALUE:nums1[part1];//find the Right minimum Element in the 1st array
            int r2= part2==n?Integer.MAX_VALUE:nums2[part2];//find the Right minimum Element in the 2nd  array
            if(l1<=r2 && l2<=r1){
                if((m+n)%2==0){
                    //condition for even length in order to find the average of two middle elements
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }else{
                    //condition for odd length in order to find the middle element
                    return Math.max(l1,l2);
                }
            }else if(l1>r2){
                end=part1-1;
            }
            else{
                start=part1+1;
            }
           
        }
         throw new IllegalArgumentException("Input arrays are not sorted properly.");
    }
    public static void main(String[] args) {
        int arr1[]={1,3};
        int arr2[]={2};
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }
}
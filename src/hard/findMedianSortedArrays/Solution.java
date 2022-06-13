package hard.findMedianSortedArrays;
//https://leetcode.com/problems/median-of-two-sorted-arrays/

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }

        int nums1Len = nums1.length;
        int nums2Len = nums2.length;
        int low = 0;
        int high = nums1Len;
        while(low <= high){
            int partition1 = (low + high) / 2;
            int partition2 = (nums1Len+nums2Len+1)/2 -partition1;

            int num1MaxLeft = partition1 ==0 ? Integer.MIN_VALUE : nums1[partition1-1];
            int num1Minright = partition1 ==nums1Len ? Integer.MAX_VALUE : nums1[partition1];
            int num2MaxLeft = partition2 ==0 ? Integer.MIN_VALUE : nums2[partition2-1];
            int num2Minright = partition2 ==nums2Len ? Integer.MAX_VALUE : nums2[partition2];

            if(num1MaxLeft > num2Minright){
                //too far to the right in nums1
                high = partition1 -1;
            }else if(num2MaxLeft > num1Minright){
                //too far to the left in nums1
                low = partition1 +1;
            }else{
                //solution found
                if((nums1Len + nums2Len) % 2 ==0 ){ return ((double)Math.max(num1MaxLeft, num2MaxLeft) + Math.min(num1Minright, num2Minright))/2 ; }
                return Math.max(num1MaxLeft, num2MaxLeft);
            }
        }
        //input data was not within problem constraints
        throw new IllegalArgumentException();
    }
}

package hard.findMedianSortedArrays;
// https://leetcode.com/problems/median-of-two-sorted-arrays/

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1= nums1.length, length2 = nums2.length;

        if(length1 > length2){
            return findMedianSortedArrays(nums2, nums1);
        }

        int total = length1 + length2;
        int leftPartitionSize = (total+1)/2;
        int low = 0, high = length1;

        while(low <= high){
            int mid1 = (low + high)/2;
            int mid2 = leftPartitionSize - mid1;

            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE, r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;

            if(mid1 < length1){
                r1 = nums1[mid1];
            }
            if(mid2 < length2){
                r2 = nums2[mid2];
            }
            if(mid1-1 >= 0){
                l1 = nums1[mid1-1];
            }
            if(mid2-1 >= 0){
                l2 = nums2[mid2-1];
            }

            if(l1 <= r2 && l2 <= r1){
                //solution found
                if(total % 2 == 0){
                    return (double) (Math.max(l1, l2) + Math.min(r1, r2))/2.0;
                }
                return Math.max(l1, l2);
            }

            if(l1 > r2){
                high = mid1-1;
            }else{
                low = mid1+1;
            }
        }

        return 0;
    }
}

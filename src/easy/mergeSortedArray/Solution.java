package easy.mergeSortedArray;

import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int index=0; index<n; index++){
            nums1[m+index] = nums2[index];
        }
        Arrays.sort(nums1);
    }

    public void mergeFast(int[] nums1, int m, int[] nums2, int n) {
        for(int index=m+n-1, nums1Index = m-1, nums2Index = n-1; index>=0 && nums2Index >=0; index--){
            if(nums1Index >= 0 && nums1[nums1Index] > nums2[nums2Index]){ nums1[index] = nums1[nums1Index--]; }
            else{ nums1[index] = nums2[nums2Index--]; }
        }
    }
}

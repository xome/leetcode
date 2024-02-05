package de.mayer.leetcode;

public class MedianTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        var merged = new int[nums1.length + nums2.length];

        var nums1Index = 0;
        var nums2Index = 0;
        var endIndex = (int) Math.ceil(((double)merged.length) / 2) + 1;
        var medianWithTwo = merged.length % 2 == 0;
        for (int i = 0; i < endIndex; i++){
            if (nums1Index < nums1.length && (nums2Index == nums2.length || nums1[nums1Index] < nums2[nums2Index])){
                merged[i] = nums1[nums1Index++];
            } else if (nums2Index < nums2.length) {
                merged[i] = nums2[nums2Index++];
            }
        }

        return medianWithTwo ? ((double) (merged[endIndex-1] + merged[endIndex-2])) / 2 : merged[endIndex-2];
    }

}

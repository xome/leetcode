package de.mayer.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
/**
 *
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * <p>
 * Example 2:
 * <p>
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */
class MedianTwoSortedArraysTest {

    MedianTwoSortedArrays obj = new MedianTwoSortedArrays();

    @DisplayName("""
            Given nums1 = [1,3], nums2 = [2]
            Then 2.0
            """)
    @Test
    void example1(){
        assertThat(obj.findMedianSortedArrays(new int[]{1,3}, new int[]{2}), is(2.0));
    }
    @DisplayName("""
            Given nums1 = [1,2], nums2 = [3,4]
            Then 2.5
            """)
    @Test
    void example2(){
        assertThat(obj.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}), is(2.5));
    }

    @DisplayName("""
            Given an empty array as nums1, and nums2=[1],
            Then 0.5
            """)
    @Test
    void emptyArray(){
        assertThat(obj.findMedianSortedArrays(new int[]{}, new int[]{1}), is(1.0));
    }

}
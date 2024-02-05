package de.mayer.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @DisplayName("""
            Given there is an array of 2 elements which sum is the target,
            Then it returns indexes 0 and 1
            """)
    @Test
    void arrayWith2Elements() {
        assertThat(twoSum.twoSum(new int[]{1,2}, 3), is(new int[]{0,1}));
    }

    @DisplayName("""
            Given there are more than 2 elements in the array (example 1),
            Then only solution is returned
            """)
    @Test
    void example2() {
        assertThat(twoSum.twoSum(new int[]{3,2,4}, 6), is(new int[]{1,2}));
    }
}
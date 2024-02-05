package de.mayer.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class AddTwoNumbersTest {

    AddTwoNumbers obj = new AddTwoNumbers();

    int[] listNodeAsArray(AddTwoNumbers.ListNode l) {
        if (l == null) return null;
        var buffer = new int[100];
        buffer[0] = l.val;
        int realLength = 1;
        while ((l = l.next) != null) {
            buffer[realLength++] = l.val;
        }
        var ret = new int[realLength];
        System.arraycopy(buffer, 0, ret, 0, realLength);
        return ret;
    }

    @DisplayName("""
            Given l1 = [2,4,3], l2 = [5,6,4],
            Then [7,0,8]
            """)
    @Test
    void example1() {

        var l1 = new AddTwoNumbers.ListNode(2, new AddTwoNumbers.ListNode(4, new AddTwoNumbers.ListNode(3)));
        var l2 = new AddTwoNumbers.ListNode(5, new AddTwoNumbers.ListNode(6, new AddTwoNumbers.ListNode(4)));

        var expected = new int[]{7, 0, 8};

        assertThat(listNodeAsArray(obj.addTwoNumbers(l1, l2)), is(expected));
    }

    @DisplayName("""
            Given l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
            Then [8,9,9,9,0,0,0,1]
            """)
    @Test
    void example2() {
        var l1 = new AddTwoNumbers.ListNode(9,
                new AddTwoNumbers.ListNode(9,
                        new AddTwoNumbers.ListNode(9,
                                new AddTwoNumbers.ListNode(9,
                                        new AddTwoNumbers.ListNode(9,
                                                new AddTwoNumbers.ListNode(9,
                                                        new AddTwoNumbers.ListNode(9)
                                                ))))));
        var l2 = new AddTwoNumbers.ListNode(9,
                new AddTwoNumbers.ListNode(9,
                        new AddTwoNumbers.ListNode(9,
                                new AddTwoNumbers.ListNode(9)
                        )));

        var expected = new int[]{8, 9, 9, 9, 0, 0, 0, 1};

        assertThat(listNodeAsArray(obj.addTwoNumbers(l1, l2)),
                is(expected));
    }

    @DisplayName("""
            Given l1 and l2 only have one element,
            Then the sum is returned
            """)
    @Test
    void onlyOneElement(){
        var l1 = new AddTwoNumbers.ListNode(9);
        var l2 = new AddTwoNumbers.ListNode(9);
        var expected = new int[]{8,1};

        assertThat(listNodeAsArray(obj.addTwoNumbers(l1, l2)), is(expected));
    }

    @DisplayName("""
            Given l1 = [9], l2 = [1,9,9,9,9,9,9,9,9,9]
            Then [0,0,0,0,0,0,0,0,0,0,1]
            """)
    @Test
    void example3(){
        var l1 = AddTwoNumbers.arrayToListNode(new char[]{'9'});
        var l2 = AddTwoNumbers.arrayToListNode(new char[]{'1','9','9','9','9','9','9','9','9','9'});

        var expected = new int[]{0,0,0,0,0,0,0,0,0,0,1};

        assertThat(listNodeAsArray(obj.addTwoNumbers(l1, l2)), is(expected));
    }

}
package de.mayer.leetcode;

import java.math.BigInteger;

public class AddTwoNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger i1 = listNode2Integer(l1);
        BigInteger i2 = listNode2Integer(l2);

        var resultAsCharArray = new StringBuilder().append(i1.add(i2)).reverse().toString().toCharArray();
        return arrayToListNode(resultAsCharArray);
    }

    static ListNode arrayToListNode(char[] resultAsCharArray) {
        var result = new ListNode(Character.getNumericValue(resultAsCharArray[0]));
        ListNode next = result;
        for (int i = 1; i < resultAsCharArray.length; i++) {
            next = next.next = new ListNode(Character.getNumericValue(resultAsCharArray[i]));
        }
        return result;
    }


    private static BigInteger listNode2Integer(ListNode l) {
        var sb = new StringBuilder();
        sb.append(l.val);
        if (l.next != null) {
            ListNode next = l.next;
            sb.append(next.val);
            while ((next = next.next) != null) {
                sb.append(next.val);
            }
        }
        return new BigInteger(sb.reverse().toString());
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

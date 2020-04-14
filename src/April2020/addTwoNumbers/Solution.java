package April2020.addTwoNumbers;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNodeResult = null;
        int flag = 0;
        if (l1.val + l2.val > 9) {
            flag = 1;
            listNodeResult = new ListNode((l1.val + l2.val) % 10);
        } else {
            listNodeResult = new ListNode(l1.val + l2.val);
        }
        ListNode listNodeResultNow = listNodeResult;


        while (l1.next != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next;
            if (l1.val + l2.val + flag > 9) {
                listNodeResultNow.next = new ListNode((l1.val + l2.val + flag) % 10);
                flag = 1;
            } else {
                listNodeResultNow.next = new ListNode(l1.val + l2.val + flag);
                flag = 0;
            }
            listNodeResultNow = listNodeResultNow.next;
        }

        while (l1.next != null) {
            l1 = l1.next;
            if (l1.val + flag > 9) {
                listNodeResultNow = listNodeResultNow.next = new ListNode((l1.val + flag) % 10);
                flag = 1;
            } else {
                listNodeResultNow = listNodeResultNow.next = new ListNode(l1.val + flag);
                flag = 0;
            }
        }


        while (l2.next != null) {
            l2 = l2.next;
            if (l2.val + flag > 9) {
                listNodeResultNow = listNodeResultNow.next = new ListNode((l2.val + flag) % 10);
                flag = 1;
            } else {
                listNodeResultNow = listNodeResultNow.next = new ListNode(l2.val + flag);
                flag = 0;
            }

        }

        if (flag == 1) {
            listNodeResultNow = listNodeResultNow.next = new ListNode(flag);
        }


        return listNodeResult;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

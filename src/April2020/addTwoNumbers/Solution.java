package April2020.addTwoNumbers;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.List;

/**
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

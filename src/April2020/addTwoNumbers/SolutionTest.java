package April2020.addTwoNumbers;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void addTwoNumbers() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        List<Integer> expect = new ArrayList<>();
        expect.add(7);
        expect.add(0);
        expect.add(8);

        ListNode result = new Solution().addTwoNumbers(l1, l2);
        List<Integer> resultToAssert = new ArrayList<>();

        System.out.println("Result:");
        resultToAssert.add(result.val);
        System.out.print("(" + result.val);
        while(result.next != null){
            result = result.next;
            resultToAssert.add(result.val);
            System.out.print(" ->" + result.val);
        }
        System.out.print(")");

        Assert.assertEquals(expect, resultToAssert);
    }

    @Test
    public void addTwoNumbers_1() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(7);

        List<Integer> expect = new ArrayList<>();
        expect.add(7);
        expect.add(0);
        expect.add(8);

        ListNode result = new Solution().addTwoNumbers(l1, l2);
        List<Integer> resultToAssert = new ArrayList<>();

        System.out.println("Result:");
        resultToAssert.add(result.val);
        System.out.print("(" + result.val);
        while(result.next != null){
            result = result.next;
            resultToAssert.add(result.val);
            System.out.print(" ->" + result.val);
        }
        System.out.print(")");

        Assert.assertEquals(expect, resultToAssert);
    }

    // wrong ！！！
    @Test
    public void addTwoNumbers_2() {
        ListNode l1 = new ListNode(5);

        ListNode l2 = new ListNode(5);

        List<Integer> expect = new ArrayList<>();
        expect.add(0);
        expect.add(1);

        ListNode result = new Solution().addTwoNumbers(l1, l2);
        List<Integer> resultToAssert = new ArrayList<>();

        System.out.println("Result:");
        resultToAssert.add(result.val);
        System.out.print("(" + result.val);
        while(result.next != null){
            result = result.next;
            resultToAssert.add(result.val);
            System.out.print(" ->" + result.val);
        }
        System.out.print(")");

        Assert.assertEquals(expect, resultToAssert);
    }

    // wrong ！！！
    @Test
    public void addTwoNumbers_3() {
        ListNode l1 = new ListNode(1);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);

        List<Integer> expect = new ArrayList<>();
        expect.add(0);
        expect.add(0);
        expect.add(1);

        ListNode result = new Solution().addTwoNumbers(l1, l2);
        List<Integer> resultToAssert = new ArrayList<>();

        System.out.println("Result:");
        resultToAssert.add(result.val);
        System.out.print("(" + result.val);
        while(result.next != null){
            result = result.next;
            resultToAssert.add(result.val);
            System.out.print(" ->" + result.val);
        }
        System.out.print(")");

        Assert.assertEquals(expect, resultToAssert);
    }
}
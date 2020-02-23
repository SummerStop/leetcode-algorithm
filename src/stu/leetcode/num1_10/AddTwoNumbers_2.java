package stu.leetcode.num1_10;

import java.util.List;

import static java.lang.Math.pow;

/**
 * @Author: ls
 * @Date: 2020/2/23 10:00
 */
public class AddTwoNumbers_2 {
/*
给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，
并且它们的每个节点只能存储 一位数字。
如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
示例：
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/add-two-numbers
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) { val = x; }
    }
    /***
     * 这道题如果走先计算出值，再相加，最后再转成链表，比较麻烦，因为测试用例都超过了int和long类型的最大值了
     * 只能从对应位数字相加，再加进位这个思路
     * 注释掉的代码只能跑通一部分测试用例
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long rs = getValue(l1)+getValue(l2);
        System.out.println(rs);
        ListNode ln = new ListNode((int)(rs%10L));
        ListNode head = ln;
        rs = rs/10;
        while(rs != 0 ){
            ln.next = new ListNode((int)(rs%10L));
            rs = rs/10;
            ln = ln.next;
        }
        return head;
    }
    public long getValue(ListNode ln){
        long i = 0,rs = 0;
        while(ln != null){
            rs += ln.val*pow(10,i);
            i ++;
            ln = ln.next;
        }
        return rs;
    }
     */
    /**
     * 使用对应位数字相加的方法，    2 ms
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1,l2,0);
    }
    public ListNode add(ListNode l1,ListNode l2,int carry){
        //加到链表的最后一位，作为结束标志
        if(l1 == null&&l2 == null&&carry == 0){
            return null;
        }
        //当位数不够时，用0代替
        if(l1 == null){
            l1 = new ListNode(0);
        }
        if(l2 == null){
            l2 = new ListNode(0);
        }
        int value = l1.val+l2.val+carry;
        ListNode node = new ListNode(value%10);
        node.next = add(l1.next,l2.next,value/10);
        //node节点就是第一个节点
        return node;
    }
}

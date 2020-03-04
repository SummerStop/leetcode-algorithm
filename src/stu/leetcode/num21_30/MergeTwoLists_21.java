package stu.leetcode.num21_30;

/**
 * @Author: ls
 * @Date: 2020/3/4 22:34
 */
public class MergeTwoLists_21 {
/***
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
  */
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    //过了好几天又来写一道simple题，困死了，睡觉，上周本来想做做题的，结果玩wzry去了，从星耀二输到星耀五，哎，
    //浪费时间还没得到应有的效益，血亏
    //1 ms
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode ln = new ListNode(0);
        ListNode head = ln;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                ln.next = new ListNode(l1.val);
                l1 = l1.next;
                ln = ln.next;
            }
            else{
                ln.next = new ListNode(l2.val);
                l2 = l2.next;
                ln = ln.next;
            }
        }
        while(l1 != null){
            ln.next = new ListNode(l1.val);
            l1 = l1.next;
            ln = ln.next;
        }
        while(l2 != null){
            ln.next = new ListNode(l2.val);
            l2 = l2.next;
            ln = ln.next;
        }
        return head.next;
    }
}

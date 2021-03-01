package stu.leetcode.num21_30;

import stu.leetcode.num1_10.AddTwoNumbers_2.ListNode;

/**
 * @Author: ls
 * @Date: 2021/1/21 23:12
 */
public class SwapPairs_24 {
  public ListNode swapPairs(ListNode head) {
    if(head == null || head.next == null) return head;
    ListNode pHead = null;
    ListNode preNode = null;
    while(head != null){
      ListNode next = head.next;
      if(next != null){
        head.next = next.next;
        next.next = head;
        if(pHead == null){
          pHead = next;
        }
      }
      else{
        break;
      }
      if(preNode == null){
        preNode = head;
      }
      else{
        preNode.next = next;
        preNode = head;
      }
      head = head.next;

    }
    return pHead;
  }
}

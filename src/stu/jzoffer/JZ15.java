package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/17 22:15
 */
public class JZ15 {
  public ListNode ReverseList(ListNode head) {
    if(head == null) return null;
    ListNode pre = null;
    ListNode next = null;
    while(head != null){
      next = head.next;
      head.next = pre;
      pre = head;
      head = next;
    }
    return pre;
  }
}

package stu.leetcode.num11_20;

/**
 * @Author: ls
 * @Date: 2021/1/18 22:20
 */
public class RemoveNthFromEnd_19 {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head == null || head.next == null) return null;
    ListNode node = head;
    while(n > 0){
      if(node.next != null){
        node = node.next;
      }
      else{
        if(n-1 == 0){
          return head.next;
        }
        else{
          return head;
        }
      }
      n--;
    }
    ListNode pHead = head;
    while(node.next != null){
      node = node.next;
      pHead = pHead.next;
    }
    pHead.next = pHead.next.next;
    return head;
  }
}
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

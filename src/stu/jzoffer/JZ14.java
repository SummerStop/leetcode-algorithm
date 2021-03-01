package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/17 22:04
 */
public class JZ14 {
  public ListNode FindKthToTail(ListNode head,int k) {
    if(k <= 0) return null;
    ListNode first = head;
    ListNode second = head;
    while(k > 0 && first != null){
      first = first.next;
      k --;
    }
    if(k != 0) return null;
    while(first != null){
      first = first.next;
      second = second.next;
    }
    return second;
  }
}

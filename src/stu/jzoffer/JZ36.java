package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/26 15:56
 */
public class JZ36 {
  public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    ListNode p1 = pHead1;
    ListNode p2 = pHead2;
    while(p1 != p2){
      p1 = (p1 == null?pHead2:p1.next);
      p2 = (p2 == null?pHead1:p2.next);
    }
    return p1;
  }
}

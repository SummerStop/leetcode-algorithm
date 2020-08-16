package stu.leetcode.num81_90;

/**
 * @Author: ls
 * @Date: 2020/8/16 15:56
 */
public class DeleteDuplicates_83 {

  /**
   * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
   */
  class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      val = x;
    }
  }
  // 1ms
  public ListNode deleteDuplicates(ListNode head) {
    if(head == null||head.next == null) return head;
    ListNode headIndex = head;

    while(headIndex != null){
      int val = headIndex.val;
      ListNode next = headIndex.next;
      while(next != null&&next.val == val){
        next = next.next;
      }
      headIndex.next = next;
      headIndex = headIndex.next;
    }
    return head;
  }

}

package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/16 23:38
 */


public class JZ16 {
  static class ListNode{
    int val;
    ListNode next;

    ListNode(int value){
      this.val = value;
    }
  }

  public ListNode Merge(ListNode list1,ListNode list2) {
    ListNode head = new ListNode(-1);
    head.next = null;
    ListNode root = head;
    while(list1 != null && list2 != null){
      if(list1.val <= list2.val){
        head.next = list1;
        head = list1;
        list1 = list1.next;
      }
      else{
        head.next = list2;
        head = list2;
        list2 = list2.next;
      }
    }
    if(list1 != null){
      head.next = list1;
    }
    if(list2 != null) {
      head.next = list2;
    }
    return root.next;
  }
}

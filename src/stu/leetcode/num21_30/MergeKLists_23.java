package stu.leetcode.num21_30;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @Author: ls
 * @Date: 2021/3/3 23:15
 */
class ListNode {
     int val;
      ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class MergeKLists_23 {
  public ListNode mergeKLists(ListNode[] lists) {
    if(lists == null || lists.length == 0){
      return null;
    }
    return merge(lists,0,lists.length-1);
  }

  ListNode merge(ListNode[] lists,int left,int right){
    if(left == right) return lists[left];
    int middle = left + (right - left)/2;
    ListNode l1 = merge(lists,left,middle);
    ListNode l2 = merge(lists,middle+1,right);
    return mergeLists(l1,l2);
  }

  ListNode mergeLists(ListNode l1,ListNode l2){
    if(l1 == null) return l2;
    if(l2 == null) return l1;
    if(l1.val < l2.val){
      l1.next = mergeLists(l1.next,l2);
      return l1;
    }
    else{
      l2.next = mergeLists(l1,l2.next);
      return l2;
    }
  }

  public ListNode mergeKLists1(ListNode[] lists) {
    if (lists == null || lists.length == 0) return null;
    PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
      @Override
      public int compare(ListNode o1, ListNode o2) {
        if (o1.val < o2.val) return -1;
        else if (o1.val == o2.val) return 0;
        else return 1;
      }
    });
    ListNode dummy = new ListNode(0);
    ListNode p = dummy;
    for (ListNode node : lists) {
      if (node != null) queue.add(node);
    }
    while (!queue.isEmpty()) {
      p.next = queue.poll();
      p = p.next;
      if (p.next != null) queue.add(p.next);
    }
    return dummy.next;
  }
}

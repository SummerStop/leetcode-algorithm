package stu.jzoffer;

import java.util.ArrayList;

/**
 * @Author: ls
 * @Date: 2020/12/29 0:05
 */
public class JZ55 {
  ArrayList<ListNode> arr = new ArrayList<>();
  public ListNode EntryNodeOfLoop(ListNode pHead)
  {
    if(pHead == null) return null;
    while(pHead != null){
      if(arr.contains(pHead)){
        return pHead;
      }
      else{
        arr.add(pHead);
        pHead = pHead.next;
      }
    }
    return null;
  }
}

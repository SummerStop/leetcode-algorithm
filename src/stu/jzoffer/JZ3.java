package stu.jzoffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author: ls
 * @Date: 2020/12/9 0:23
 */
class ListNode{
  int val;
  ListNode next;
}
public class JZ3 {
  // 手撕，需要注意小细节处理
  public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    Stack<Integer> stack = new Stack<>();
    while(listNode != null){
      stack.push(listNode.val);
      listNode = listNode.next;
    }
    ArrayList<Integer> list = new ArrayList<>();
    while(!stack.isEmpty()){
      list.add(stack.pop());
    }
    return list;
  }
}

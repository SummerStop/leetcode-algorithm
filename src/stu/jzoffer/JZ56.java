package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/29 23:56
 */
import java.util.Stack;
public class JZ56 {
  public ListNode deleteDuplication(ListNode pHead)
  {
    if(pHead == null) return null;
    Stack<ListNode> stack = new Stack<>();
    ListNode node = null;
    while(pHead != null){
      if(stack.isEmpty()){
        if(node != null && pHead.next == null && node.val == pHead.val){
          break;
        }
        stack.push(pHead);
      }
      else{
        node = stack.peek();
        if(node.val == pHead.val){
          node = stack.pop();
        }
        else{
          stack.push(pHead);
        }
      }
      pHead = pHead.next;
    }
    ListNode nextNode = null;
    while(!stack.isEmpty()){
      ListNode tmp = stack.pop();
      tmp.next = nextNode;
      nextNode = tmp;
    }
    return nextNode;
  }
}

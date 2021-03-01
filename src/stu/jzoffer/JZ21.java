package stu.jzoffer;

import java.util.Stack;
/**
 * @Author: ls
 * @Date: 2020/12/19 15:47
 */
public class JZ21 {
  public boolean IsPopOrder(int [] pushA,int [] popA) {
    if(pushA == null || popA == null) return false;
    int index = 0;
    Stack<Integer> stack = new Stack<>();
    for(int i = 0;i < pushA.length;i ++){
      stack.push(pushA[i]);
      while(!stack.isEmpty()&&stack.peek() == popA[index]){
        stack.pop();
        index ++;
      }
    }
    return stack.isEmpty();
  }
}

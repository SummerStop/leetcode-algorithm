package stu.jzoffer;

import java.util.Stack;
/**
 * @Author: ls
 * @Date: 2020/12/14 22:07
 */
public class JZ5 {
  Stack<Integer> stack1 = new Stack<Integer>();
  Stack<Integer> stack2 = new Stack<Integer>();

  public void push(int node) {
    stack1.push(node);
  }

  public int pop() {
    if(stack1.isEmpty()){
      return -1;
    }
    while(!stack1.isEmpty()){
      stack2.push(stack1.pop());
    }
    int value = stack2.pop();
    while(!stack2.isEmpty()){
      stack1.push(stack2.pop());
    }
    return value;
  }
}

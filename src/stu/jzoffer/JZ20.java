package stu.jzoffer;

import java.util.Stack;
/**
 * @Author: ls
 * @Date: 2020/12/19 15:36
 */
public class JZ20 {
  Stack<Integer> min = new Stack<>();
  Stack<Integer> stack = new Stack<>();

  public void push(int node) {
    if(min.isEmpty() || min.peek() > node){
      min.push(node);
    }
    stack.push(node);
  }

  public void pop() {
    int node = stack.pop();
    if(node == min.peek()){
      min.pop();
    }
  }

  public int top() {
    return stack.peek();
  }

  public int min() {
    return min.peek();
  }
}

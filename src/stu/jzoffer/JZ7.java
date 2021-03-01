package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/14 22:37
 */
public class JZ7 {
  public int Fibonacci(int n) {
    if(n < 2) return n;
    return Fibonacci(n-1)+Fibonacci(n-2);
  }
}

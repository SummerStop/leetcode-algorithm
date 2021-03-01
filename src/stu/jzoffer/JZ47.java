package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/27 10:57
 */
public class JZ47 {
  public int Sum_Solution(int n) {
    int sum = n;
    boolean ans = (n>0)&&(sum += Sum_Solution(n-1))>0;
    return sum;
  }
}

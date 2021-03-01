package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/14 22:41
 */
public class JZ8 {
  public int JumpFloor(int target) {
    if(target < 3) return target;
    return JumpFloor(target - 1)+JumpFloor(target-2);
  }
}

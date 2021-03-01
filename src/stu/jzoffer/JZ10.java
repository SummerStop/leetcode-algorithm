package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/14 22:59
 */
public class JZ10 {
  public int RectCover(int target) {
    if(target < 3)  return target;
    return RectCover(target - 1)+RectCover(target-2);
  }
}

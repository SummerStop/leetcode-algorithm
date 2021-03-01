package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/14 23:07
 */
public class JZ11 {
  public int NumberOf1(int n) {
    int count = 0;
    for(int i = 0;i < 32;i ++){
      if((n >>> i &1) == 1){
        count ++;
      }
    }
    return count;
  }
}

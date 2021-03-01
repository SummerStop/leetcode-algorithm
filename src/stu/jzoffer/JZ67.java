package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2021/1/6 0:31
 */
public class JZ67 {
  // 抄
  public static int cutRope(int n) {
    if(n==2){
      return 1;
    }else if(n==3){
      return 2;
    }
    if(n%3==0){
      return (int)Math.pow(3,n/3);
    }else if(n%3==1){
      return 4*(int)Math.pow(3,n/3-1);
    }else {
      return 2*(int)Math.pow(3,n/3);
    }
  }
}

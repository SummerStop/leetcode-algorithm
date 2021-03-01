package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/22 23:28
 */
public class JZ31 {
  // 摘抄
  public int NumberOf1Between1AndN_Solution(int n) {
    int count = 0;
    for(int i = 1;i <= n;i *= 10){
      int k = i*10;
      count += (n / k)*i;
      if(n%k > i*2-1){
        count+=i;
      }
      else if(n%k < i){
        count += 0;
      }
      else{
        count += n%k-i+1;
      }
    }
    return count;
  }
}

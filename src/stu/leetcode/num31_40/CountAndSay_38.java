package stu.leetcode.num31_40;

/**
 * @Author: ls
 * @Date: 2020/7/28 23:48
 */
public class CountAndSay_38 {

  /**
   *外观数列，反正题目没看懂，抄了个答案
   */
  public String countAndSay(int n) {
    String s = "1";
    for(int i=2;i<=n;i++){
      s = toConver(s);
    }
    return s;
  }

  String toConver(String s){
    int len = s.length();
    int n=0;
    StringBuilder sb = new StringBuilder();
    char c = s.charAt(0);
    int i=0;
    while(i<len){
      if(c == s.charAt(i)){
        n++;
        i++;
      }else{
        sb.append(n).append(c);
        n=1;
        c=s.charAt(i);
        i++;
      }
    }
    sb.append(n).append(c);
    return sb.toString();
  }
}

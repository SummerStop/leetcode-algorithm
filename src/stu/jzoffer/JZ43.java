package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/26 18:37
 */
public class JZ43 {
  public String LeftRotateString(String str,int n) {
    if("".equals(str)) return "";
    n = n%str.length();
    String st = str.substring(0, n);
    StringBuilder sb = new StringBuilder(str);
    sb.delete(0,  n);
    sb.append(st);
    return sb.toString();
  }
}

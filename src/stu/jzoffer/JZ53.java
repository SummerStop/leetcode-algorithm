package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/28 23:37
 */
public class JZ53 {
  public boolean isNumeric(char[] str) {
    String string = String.valueOf(str);
    return string.matches("[\\+-]?[0-9]*(\\.[0-9]*)?([eE][\\+-]?[0-9]+)?");
  }
}

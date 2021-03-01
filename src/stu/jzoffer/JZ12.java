package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/15 23:30
 */
public class JZ12 {
  public double Power(double base, int exponent) {
    double value = 1;
    for(int i = 0 ;i < Math.abs(exponent);i ++){
      value *= base;
    }
    return exponent < 0?1/value:value;
  }
}

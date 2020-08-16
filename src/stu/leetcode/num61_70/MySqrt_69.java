package stu.leetcode.num61_70;

/**
 * @Author: ls
 * @Date: 2020/8/4 22:49
 */
public class MySqrt_69 {

  int s;

  public int niudun(int x) {
    int temp = x;
    if (x == 0) {
      return 0;
    }
    return ((int) (niudunSqrt(x, temp)));
  }

  private double niudunSqrt(double x, int temp) {
    double result = (x + temp / x) / 2;
    System.out.println(result);
    return result == x ? result : niudunSqrt(result, temp);
  }


  //手搓二分法
  public int mysqrt(int x) {
    int left = 0;
    // 为了兼容小于4的x
    int right = x / 2 + 1;
    while (left < right) {
      // 向右取中位数，如果取左中位数，代码会进入死循环
      // long mid = left + (right - left + 1) / 2;
      int mid = (left + right + 1) >>> 1;
      long result = mid * mid;
      if (result <= x) {
        left = mid;
      } else {
        right = mid - 1;
      }
    }
    return left;
  }


  //二分法
  public int mySqrt(int x) {
    long left = 0;
    // 偏向右中心点
    long right = x / 2 + 1;
    while (left < right) {
      // 偏向右中心点
      long mid = (left + right + 1) >>> 1;
      long square = mid * mid;
      if (square > x) {
        right = mid - 1;
      } else {
        left = mid;
      }
    }
    return (int) left;
  }

  // 牛顿迭代法
  public int mySqrt1(int x) {
    s = x;
    if (x == 0) {
      return 0;
    }
    return ((int) (sqrts(x)));
  }

  public double sqrts(double x) {
    double res = (x + s / x) / 2;
    if (res == x) {
      return x;
    } else {
      return sqrts(res);
    }
  }

  public static void main(String[] args) {
    System.out.println(new MySqrt_69().niudun(15));
  }
}

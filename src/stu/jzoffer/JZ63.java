package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/30 23:12
 */
import java.util.*;
public class JZ63 {

  List<Integer> list = new ArrayList<>();

  public void Insert(Integer num) {
    list.add(num);
  }

  public Double GetMedian() {
    int len = list.size();
    Collections.sort(list);
    if (len % 2 == 0) {
      int a = list.get(len / 2);
      int b = list.get(len / 2 - 1);
      return (a + b) * 1.0 / 2;
    } else {
      return list.get(len / 2) * 1.0;
    }
  }

}

package stu.jzoffer;

import java.util.ArrayList;
/**
 * @Author: ls
 * @Date: 2020/12/23 0:00
 */
public class JZ33 {
  public int GetUglyNumber_Solution(int index) {
    ArrayList<Integer> arr = new ArrayList<>();
    if(index <= 0) return 0;
    int i2 = 0,i3 = 0,i5=0;
    arr.add(1);
    for(int i = 1;i < index;i ++){
      int num2 = arr.get(i2)*2;
      int num3 = arr.get(i3)*3;
      int num5 = arr.get(i5)*5;
      int min = Math.min(num2,Math.min(num3,num5));
      if(min == num2) i2 ++;
      if(min == num3) i3 ++;
      if(min == num5) i5 ++;
      arr.add(min);
    }
    return arr.get(arr.size()-1);
  }
}

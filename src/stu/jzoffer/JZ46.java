package stu.jzoffer;

import java.util.ArrayList;

/**
 * @Author: ls
 * @Date: 2020/12/26 18:55
 */
public class JZ46 {
  public int LastRemaining_Solution(int n, int m) {
    if(n <= 0) return -1;
    ArrayList<Integer> arr = new ArrayList<>();
    for(int i = 0;i < n;i ++){
      arr.add(i);
    }
    int step = m - 1;  // 换算下标
    int index = 0;
    while(arr.size() != 1){
      index = ((step % arr.size())+index)%arr.size();
      arr.remove(index);
    }
    return arr.get(0);
  }
}

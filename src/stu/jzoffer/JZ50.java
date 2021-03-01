package stu.jzoffer;

import java.util.ArrayList;

/**
 * @Author: ls
 * @Date: 2020/12/27 11:12
 */
public class JZ50 {
  public boolean duplicate(int numbers[],int length,int [] duplication) {
    if(numbers == null || numbers.length == 0) return false;
    ArrayList<Integer> arr = new ArrayList<>();
    for(int i = 0;i < length;i ++){
      if(arr.contains(numbers[i])){
        duplication[0] = numbers[i];
        return true;
      }
      else{
        arr.add(numbers[i]);
      }
    }
    return false;
  }
}

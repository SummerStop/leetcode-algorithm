package stu.jzoffer;

import java.util.ArrayList;

/**
 * @Author: ls
 * @Date: 2020/12/26 18:25
 */
public class JZ42 {
  public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
    ArrayList<Integer> arr = new ArrayList<>();
    int left = 0;
    int right = array.length-1;
    while(left < right){
      int curSum = array[left]+array[right];
      if(curSum < sum){
        left ++;
      }
      else if(curSum > sum){
        right --;
      }
      else{
        arr.add(array[left]);
        arr.add(array[right]);
        break;
      }
    }
    return arr;
  }
}

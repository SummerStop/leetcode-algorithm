package stu.jzoffer;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collections;
/**
 * @Author: ls
 * @Date: 2020/12/22 23:52
 */
public class JZ32 {
  public String PrintMinNumber(int [] numbers) {
    if(numbers == null || numbers.length == 0){
      return "";
    }
    Set<String> set = new TreeSet();
    minNum(numbers,0,set);
    ArrayList<String> arr = new ArrayList<>();
    arr.addAll(set);
    Collections.sort(arr);
    return arr.get(0);

  }

  public void minNum(int[] numbers,int k,Set<String> set){
    if(k == numbers.length-1){
      String s = "";
      for(int i = 0;i < numbers.length;i ++){
        s += numbers[i];
      }
      set.add(s);
    }
    for(int i = k;i < numbers.length;i ++){
      swap(numbers,i,k);
      minNum(numbers,k+1,set);
      swap(numbers,i,k);
    }
  }

  void swap(int[] arr,int i,int j){
    if(i != j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
  }
}
